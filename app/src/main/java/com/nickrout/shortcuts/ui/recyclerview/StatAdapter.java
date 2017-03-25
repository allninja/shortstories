package com.nickrout.shortcuts.ui.recyclerview;

import com.nickrout.shortcuts.R;
import com.nickrout.shortcuts.model.Stat;

import java.util.List;

public class StatAdapter extends SingleLayoutDataBindingAdapter {

    private List<Stat> mStats;

    public StatAdapter(List<Stat> stats) {
        super(R.layout.item_stat);
        mStats = stats;
    }

    @Override
    public int getItemCount() {
        return mStats == null ? 0 : mStats.size();
    }

    @Override
    protected Object getObjForPosition(int position) {
        return mStats == null || mStats.isEmpty() ? null : mStats.get(position);
    }
}
