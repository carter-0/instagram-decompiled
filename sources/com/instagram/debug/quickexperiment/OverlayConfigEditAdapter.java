package com.instagram.debug.quickexperiment;

import X.0KC;
import X.2Ru;
import X.AnonymousClass7TE;
import X.C231272rL;
import X.C231642s0;
import X.C336947fR;
import X.C39695A5l;
import X.C46448DfA;
import X.C50989Fmc;
import X.C70944OSr;
import X.E9R;
import X.FAT;
import X.G6X;
import X.NLJ;
import X.NLK;
import X.NLQ;
import X.NLR;
import X.PR7;
import X.PR9;
import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.List;

public class OverlayConfigEditAdapter extends 2Ru implements C231272rL {
    public static final String TAG = "OverlayConfigEditAdapter";
    public final C336947fR mHeaderBinderGroup;
    public List mItems = AnonymousClass7TE.A1C();
    public final NLQ mMenuItemBinderGroup;
    public final NLJ mMenuItemWithActionLabelViewBinderGroup;
    public final NLK mSeparatorBinderGroup;
    public final C39695A5l mSimpleBadgeHeaderPaddingState;
    public final NLR mSwitchBinderGroup;
    public final E9R mTypeaheadHeaderBinderGroup;

    public OverlayConfigEditAdapter getAdapter() {
        return this;
    }

    public void setMenuItemList(List list) {
        this.mItems.clear();
        this.mItems.addAll(list);
        updateItems();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.A5l] */
    /* JADX WARNING: type inference failed for: r5v0, types: [X.2s0, X.E9R, java.lang.Object] */
    public OverlayConfigEditAdapter(Context context, G6X g6x) {
        NLQ nlq = new NLQ(context);
        this.mMenuItemBinderGroup = nlq;
        C336947fR r1 = new C336947fR(context);
        this.mHeaderBinderGroup = r1;
        NLJ nlj = new NLJ(context);
        this.mMenuItemWithActionLabelViewBinderGroup = nlj;
        this.mSimpleBadgeHeaderPaddingState = new Object();
        ? obj = new Object();
        obj.A00 = g6x;
        this.mTypeaheadHeaderBinderGroup = obj;
        NLR nlr = new NLR(context);
        this.mSwitchBinderGroup = nlr;
        NLK nlk = new NLK(context);
        this.mSeparatorBinderGroup = nlk;
        init(new C231642s0[]{r1, nlq, nlr, nlj, obj, nlk});
        updateItems();
    }

    private void updateItems() {
        C231642s0 r0;
        Object fat;
        C231642s0 r02;
        clear();
        addModel((Object) null, this.mTypeaheadHeaderBinderGroup);
        for (Object next : this.mItems) {
            if (next instanceof C46448DfA) {
                fat = this.mSimpleBadgeHeaderPaddingState;
                r02 = this.mHeaderBinderGroup;
            } else if (next instanceof PR7) {
                fat = new FAT(false, false, true);
                r02 = this.mMenuItemWithActionLabelViewBinderGroup;
            } else if (next instanceof C50989Fmc) {
                fat = new FAT(false, false, false);
                r02 = this.mMenuItemBinderGroup;
            } else {
                if (next instanceof PR9) {
                    r0 = this.mSwitchBinderGroup;
                } else if (next instanceof C70944OSr) {
                    r0 = this.mSeparatorBinderGroup;
                } else {
                    0KC.A0C(TAG, StringFormatUtil.formatStrLocaleSafe("## Missing BinderGroup support=%s", next.toString()));
                }
                addModel(next, r0);
            }
            addModel(next, fat, r02);
        }
        notifyDataSetChanged();
    }

    public void updateListView() {
        notifyDataSetChanged();
    }
}
