package my_click.service;

import my_click.domain.Card;
import my_click.domain.TransActionHistory;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

public interface TransActionService {
    Logger logger = Logger.getLogger(TransActionHistory.class.getName());
    Set<TransActionHistory> TRANS_ACTION_HISTORY_LIST = new TreeSet<>();
    void showAll(TransActionHistory transActionHistory, Card card);
    boolean add(TransActionHistory transActionHistory);
}
