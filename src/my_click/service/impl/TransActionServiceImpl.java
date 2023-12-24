package my_click.service.impl;

import my_click.domain.Card;
import my_click.domain.TransActionHistory;
import my_click.enums.StatusEnum;
import my_click.service.TransActionService;

public class TransActionServiceImpl implements TransActionService {
    @Override
    public void showAll(TransActionHistory transActionHistory, Card card) {
        synchronized (transActionHistory) {
            for (TransActionHistory history : TRANS_ACTION_HISTORY_LIST) {
                if (history.getFromCard().getId().equals(card.getId())) {
                    System.out.println("1. " + history.getLocalDateTime() + " from " + history.getFromCard().getCardNumber() + " to " +
                            history.getToCard().getCardNumber() + " amount: -" + history.getAmount() + ", status- " + history.getStatusEnum());
                    break;
                }
                if (history.getToCard().getId().equals(card.getId())) {
                    System.out.println("1. " + history.getLocalDateTime() + " from " + history.getFromCard().getCardNumber() + " to " +
                            history.getToCard().getCardNumber() + " amount: +" + history.getAmount() + ", status- " + history.getStatusEnum());
                }
            }
        }
    }

    @Override
    public boolean add(TransActionHistory transActionHistory) {
        synchronized (transActionHistory) {
            if (transActionHistory.getAmount() == 0) {
                transActionHistory.setStatusEnum(StatusEnum.FAIL);
                return false;
            }
            TRANS_ACTION_HISTORY_LIST.add(transActionHistory);
            transActionHistory.setStatusEnum(StatusEnum.SUCCESS);
            return true;
        }
    }
}
