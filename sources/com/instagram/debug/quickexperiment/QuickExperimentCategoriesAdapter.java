package com.instagram.debug.quickexperiment;

import X.0KC;
import X.2Ru;
import X.AnonymousClass7TE;
import X.C231272rL;
import X.C231642s0;
import X.C46448DfA;
import X.C46457DfL;
import X.C50989Fmc;
import X.C61489K9u;
import X.C70944OSr;
import X.E9R;
import X.FAT;
import X.G6T;
import X.G6X;
import X.NLJ;
import X.NLK;
import X.NLN;
import X.NLQ;
import X.NLR;
import X.OIM;
import X.PR7;
import X.PR9;
import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.List;

public class QuickExperimentCategoriesAdapter extends 2Ru implements C231272rL {
    public static final Class TAG = QuickExperimentCategoriesAdapter.class;
    public List mCategoryList = AnonymousClass7TE.A1C();
    public final C46457DfL mHeaderBinderGroup;
    public final NLN mIgdsTextCellItemBinderGroup;
    public Boolean mInTestRigMode = false;
    public boolean mIsSearching = false;
    public final C61489K9u mLoadingRowBinderGroup;
    public final NLQ mMenuItemBinderGroup;
    public final NLJ mMenuItemWithActionLabelViewBinderGroup;
    public final NLK mSeparatorBinderGroup;
    public final NLR mSwitchBinderGroup;
    public final E9R mTypeaheadHeaderBinderGroup;
    public final boolean mUseRecyclerView;

    public QuickExperimentCategoriesAdapter getAdapter() {
        return this;
    }

    public void setMenuItemList(List list) {
        this.mCategoryList.clear();
        this.mCategoryList.addAll(list);
        this.mIsSearching = false;
        updateItems();
    }

    public void setSearching(boolean z) {
        this.mIsSearching = z;
        updateItems();
    }

    public void updateListView() {
        if (this.mUseRecyclerView) {
            notifyDataSetChanged();
        } else {
            QuickExperimentCategoriesAdapter.super.updateListView();
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.2s0, X.E9R, java.lang.Object] */
    public QuickExperimentCategoriesAdapter(Context context, G6X g6x, Boolean bool, Boolean bool2) {
        NLQ nlq = new NLQ(context);
        this.mMenuItemBinderGroup = nlq;
        NLN nln = new NLN(context);
        this.mIgdsTextCellItemBinderGroup = nln;
        C46457DfL dfL = new C46457DfL(context, (G6T) null);
        this.mHeaderBinderGroup = dfL;
        NLJ nlj = new NLJ(context);
        this.mMenuItemWithActionLabelViewBinderGroup = nlj;
        ? obj = new Object();
        obj.A00 = g6x;
        this.mTypeaheadHeaderBinderGroup = obj;
        NLR nlr = new NLR(context);
        this.mSwitchBinderGroup = nlr;
        C61489K9u k9u = new C61489K9u(context, (Integer) null);
        this.mLoadingRowBinderGroup = k9u;
        NLK nlk = new NLK(context);
        this.mSeparatorBinderGroup = nlk;
        this.mUseRecyclerView = bool.booleanValue();
        this.mInTestRigMode = bool2;
        init(new C231642s0[]{dfL, nlq, nlr, k9u, nlj, obj, nlk, nln});
        updateItems();
    }

    private void updateItems() {
        C231642s0 r0;
        FAT fat;
        C231642s0 r02;
        clear();
        if (!this.mInTestRigMode.booleanValue()) {
            addModel((Object) null, this.mTypeaheadHeaderBinderGroup);
        }
        if (this.mIsSearching) {
            addModel((Object) null, this.mLoadingRowBinderGroup);
        } else {
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
                    } else if (next instanceof C70944OSr) {
                        r0 = this.mSeparatorBinderGroup;
                    } else if (next instanceof OIM) {
                        r0 = this.mIgdsTextCellItemBinderGroup;
                    } else {
                        0KC.A02(TAG, StringFormatUtil.formatStrLocaleSafe("## Missing BinderGroup support=%s", next.toString()));
                    }
                    addModel(next, fat, r02);
                }
                addModel(next, r0);
            }
        }
        updateListView();
    }
}
