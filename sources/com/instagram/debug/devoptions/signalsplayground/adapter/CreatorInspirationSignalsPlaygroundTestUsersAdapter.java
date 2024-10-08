package com.instagram.debug.devoptions.signalsplayground.adapter;

import X.0qQ;
import X.2Rw;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C249703kE;
import X.DbT;
import X.DbV;
import X.DbW;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.debug.devoptions.signalsplayground.model.TestUserListItem;
import com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundTestUserHeaderViewHolder;
import com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundTestUserRowViewHolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CreatorInspirationSignalsPlaygroundTestUsersAdapter extends 2Rw {
    public static final Companion Companion = new Object();
    public static final int TYPE_HEADER = 0;
    public static final int TYPE_USER = 1;
    public final AnonymousClass0iw analyticsModule;
    public final CreatorInspirationSignalsPlaygroundTestUserRowViewHolder.Delegate delegate;
    public final ArrayList testUserListItems = AnonymousClass7TE.A1C();

    public void onBindViewHolder(C249703kE r3, int i) {
        0qQ.A0B(r3, 0);
        if (r3 instanceof CreatorInspirationSignalsPlaygroundTestUserHeaderViewHolder) {
            Object obj = this.testUserListItems.get(i);
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.model.TestUserListItem.TestUserHeader");
            ((CreatorInspirationSignalsPlaygroundTestUserHeaderViewHolder) r3).bind(((TestUserListItem.TestUserHeader) obj).titleRes, i);
        } else if (r3 instanceof CreatorInspirationSignalsPlaygroundTestUserRowViewHolder) {
            Object obj2 = this.testUserListItems.get(i);
            0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.model.TestUserListItem.TestUserItem");
            ((CreatorInspirationSignalsPlaygroundTestUserRowViewHolder) r3).bind(((TestUserListItem.TestUserItem) obj2).user);
        }
    }

    public C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        if (i == 0) {
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new CreatorInspirationSignalsPlaygroundTestUserHeaderViewHolder(DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.creator_inspiration_signals_playground_test_user_header_item, false));
        } else if (i == 1) {
            int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new CreatorInspirationSignalsPlaygroundTestUserRowViewHolder(DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.creator_inspiration_signals_playground_test_user_row_item, false), this.analyticsModule, this.delegate);
        } else {
            throw DbW.A0a(AnonymousClass000.A00(2528), i);
        }
    }

    public final void setTestUserListItems(List list) {
        0qQ.A0B(list, 0);
        ArrayList arrayList = this.testUserListItems;
        arrayList.clear();
        arrayList.addAll(list);
        notifyItemRangeChanged(0, list.size());
    }

    public CreatorInspirationSignalsPlaygroundTestUsersAdapter(AnonymousClass0iw r2, CreatorInspirationSignalsPlaygroundTestUserRowViewHolder.Delegate delegate2) {
        AnonymousClass7TG.A1O(r2, delegate2);
        this.analyticsModule = r2;
        this.delegate = delegate2;
    }

    public int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1047790167);
        int size = this.testUserListItems.size();
        AnonymousClass0fD.A0A(1027877296, A03);
        return size;
    }

    public int getItemViewType(int i) {
        int A03 = AnonymousClass0fD.A03(-289732153);
        int i2 = 1;
        int i3 = -1873361922;
        if (this.testUserListItems.get(i) instanceof TestUserListItem.TestUserHeader) {
            i2 = 0;
            i3 = 1702992782;
        }
        AnonymousClass0fD.A0A(i3, A03);
        return i2;
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
