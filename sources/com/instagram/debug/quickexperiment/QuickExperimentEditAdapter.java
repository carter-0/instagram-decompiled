package com.instagram.debug.quickexperiment;

import X.0KC;
import X.2Ru;
import X.AnonymousClass7TE;
import X.C231272rL;
import X.C231642s0;
import X.C46448DfA;
import X.C46457DfL;
import X.C50989Fmc;
import X.FAT;
import X.G6T;
import X.NLJ;
import X.NLQ;
import X.NLR;
import X.PR7;
import X.PR9;
import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.List;

public class QuickExperimentEditAdapter extends 2Ru implements C231272rL {
    public static final Class TAG = QuickExperimentEditAdapter.class;
    public List mCategoryList = AnonymousClass7TE.A1C();
    public final Context mContext;
    public final C46457DfL mHeaderBinderGroup;
    public final NLQ mMenuItemBinderGroup;
    public final NLJ mMenuItemWithActionLabelViewBinderGroup;
    public final NLR mSwitchBinderGroup;

    public QuickExperimentEditAdapter getAdapter() {
        return this;
    }

    public void setMenuItemList(List list) {
        this.mCategoryList.clear();
        this.mCategoryList.addAll(list);
        updateItems();
    }

    public QuickExperimentEditAdapter(Context context) {
        this.mContext = context;
        NLQ nlq = new NLQ(context);
        this.mMenuItemBinderGroup = nlq;
        NLR nlr = new NLR(context);
        this.mSwitchBinderGroup = nlr;
        C46457DfL dfL = new C46457DfL(context, (G6T) null);
        this.mHeaderBinderGroup = dfL;
        NLJ nlj = new NLJ(context);
        this.mMenuItemWithActionLabelViewBinderGroup = nlj;
        init(new C231642s0[]{dfL, nlj, nlq, nlr});
        updateItems();
    }

    private void updateItems() {
        C231642s0 r0;
        FAT fat;
        C231642s0 r02;
        clear();
        for (Object next : this.mCategoryList) {
            if (next instanceof C46448DfA) {
                r0 = this.mHeaderBinderGroup;
            } else {
                if (next instanceof PR7) {
                    fat = new FAT(false, false, true);
                    r02 = this.mMenuItemWithActionLabelViewBinderGroup;
                } else if (next instanceof C50989Fmc) {
                    fat = new FAT(false, false, false);
                    r02 = this.mMenuItemBinderGroup;
                } else if (next instanceof PR9) {
                    r0 = this.mSwitchBinderGroup;
                } else {
                    0KC.A02(TAG, StringFormatUtil.formatStrLocaleSafe("## Missing BinderGroup support=%s", next.toString()));
                }
                addModel(next, fat, r02);
            }
            addModel(next, r0);
        }
        updateListView();
    }
}
