package com.instagram.mainfeed.unconnectedcontent;

import X.0n6;
import X.0nA;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass0fU;
import X.AnonymousClass4ZI;
import X.AnonymousClass4ZJ;
import X.C229782oC;
import X.C231632rz;
import X.C232452tk;
import X.C232672uC;
import X.C242603Vd;
import X.C272714lF;
import X.C2804151s;
import X.C49485EwQ;
import X.C56746IAv;
import android.content.Context;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

public final class GroupSetBinderGroup extends C231632rz {
    public static final C232452tk Companion = new Object();
    public static final int ITEM_VIEW_TYPE_GROUP_SET_HEADER = 0;
    public static final int NUM_VIEW_TYPES = 3;
    public final C229782oC delegate;
    public final UserSession userSession;

    public GroupSetBinderGroup(UserSession userSession2, C229782oC r3) {
        0qQ.A0B(userSession2, 1);
        0qQ.A0B(r3, 2);
        this.userSession = userSession2;
        this.delegate = r3;
    }

    public void buildRowViewTypes(C232672uC r3, AnonymousClass4ZI r4, C2804151s r5) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(r4, 1);
        0qQ.A0B(r5, 2);
        r3.A7V(0, r4, r5);
    }

    public String getBinderGroupName() {
        return "GroupSet";
    }

    public int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        String str = ((C272714lF) ((AnonymousClass4ZI) obj).A00).A06;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public int getViewModelHash(int i, Object obj, Object obj2) {
        return Integer.MAX_VALUE;
    }

    public int getViewTypeCount() {
        return 3;
    }

    public void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1873585415);
        0qQ.A0B(view, 1);
        0qQ.A0B(obj, 2);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.mainfeed.unconnectedcontent.GroupSetHeaderViewBinder.Holder");
        C49485EwQ ewQ = (C49485EwQ) tag;
        AnonymousClass4ZI r10 = (AnonymousClass4ZI) obj;
        C229782oC r6 = this.delegate;
        0qQ.A0B(ewQ, 0);
        0qQ.A0B(r10, 1);
        0qQ.A0B(r6, 2);
        AnonymousClass4ZJ A00 = r10.A00(C242603Vd.OLDER_POSTS.A00);
        if (A00 != null) {
            IgTextView igTextView = ewQ.A00;
            igTextView.setText(A00.A05);
            AnonymousClass0fU.A00(new C56746IAv(A00, r6), igTextView);
            if (!r10.A02()) {
                igTextView.setVisibility(0);
            }
        }
        for (AnonymousClass4ZJ r2 : r10.A01()) {
            if (0qQ.A0K(r2.A03, r10.A01)) {
                ewQ.A01.setText(r2.A05);
            }
        }
        AnonymousClass0fD.A0A(201782743, A03);
    }

    public View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-502904764);
        0qQ.A0B(viewGroup, 1);
        Context context = viewGroup.getContext();
        0qQ.A07(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_group_set_header, viewGroup, false);
        IgTextView requireViewById = inflate.requireViewById(R.id.title);
        0qQ.A07(requireViewById);
        IgTextView requireViewById2 = inflate.requireViewById(R.id.open_older_posts);
        0qQ.A07(requireViewById2);
        0qQ.A07(inflate.requireViewById(R.id.top_divider));
        0qQ.A07(inflate.requireViewById(R.id.bottom_divider));
        inflate.setTag(new C49485EwQ(requireViewById, requireViewById2));
        RectF rectF = 0nA.A01;
        inflate.setAccessibilityDelegate(new 0n6());
        AnonymousClass0fD.A0A(870454877, A03);
        return inflate;
    }
}
