package com.ccjeng.stock.model.interfaces;

import com.ccjeng.stock.model.HistoricalDataItem;

import java.util.ArrayList;

/**
 * Created by andycheng on 2016/3/13.
 */
public interface IChartDataCallback {

    void onQueryReceived(ArrayList<HistoricalDataItem> items, String volume);

}
