package com.instagram.debug.devoptions.metadata.viewmodel;

import X.02z;
import X.05G;
import X.0qQ;
import X.106;
import X.2Dr;
import X.2Fk;
import X.2L2;
import X.2YL;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass3U9;
import X.AnonymousClass6W3;
import X.AnonymousClass7TE;
import X.C228042kh;
import X.C254763t0;
import X.C254773t1;
import X.C254783t2;
import X.C66579MXk;
import X.DbT;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.model.ThreadMetadataOverride;
import com.instagram.debug.devoptions.metadata.store.ThreadMetadataOverrideStore;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ThreadMetadataOverrideViewModel extends 2YL {
    public final 05G _viewState;
    public final List metadataList;
    public final AnonymousClass0eM store$delegate = AnonymousClass0eN.A01(new ThreadMetadataOverrideViewModel$store$2(this));
    public final AnonymousClass3U9 thread;
    public final UserSession userSession;
    public final 2Fk viewState;

    public final class Factory extends C228042kh {
        public final C254783t2 thread;
        public final UserSession userSession;

        public Factory(UserSession userSession2, C254783t2 r3) {
            0qQ.A0B(userSession2, 1);
            this.userSession = userSession2;
            this.thread = r3;
        }

        public ThreadMetadataOverrideViewModel create() {
            C254773t1 r1;
            UserSession userSession2 = this.userSession;
            2Dr A00 = 2L2.A00(userSession2);
            C254783t2 r0 = this.thread;
            if (r0 != null) {
                r1 = AnonymousClass6W3.A02(r0);
            } else {
                r1 = null;
            }
            0qQ.A0C(r1, C66579MXk.A00(373));
            String str = ((C254763t0) r1).A00;
            0qQ.A0B(str, 0);
            AnonymousClass3U9 A0N = A00.A0N(str);
            0qQ.A0C(A0N, "null cannot be cast to non-null type com.instagram.direct.model.thread.summary.DirectThreadModel");
            return new ThreadMetadataOverrideViewModel(userSession2, A0N);
        }
    }

    public ThreadMetadataOverrideViewModel(UserSession userSession2, AnonymousClass3U9 r3) {
        0qQ.A0B(userSession2, 1);
        this.userSession = userSession2;
        this.thread = r3;
        02z A01 = 106.A01(ViewState.Loading.INSTANCE);
        this._viewState = A01;
        this.viewState = DbT.A0G(A01);
        this.metadataList = AnonymousClass7TE.A1C();
    }

    private final ThreadMetadataOverrideStore getStore() {
        return (ThreadMetadataOverrideStore) this.store$delegate.getValue();
    }

    public final void fetch() {
        05G r2;
        Object success;
        if (this.thread == null) {
            r2 = this._viewState;
            success = ViewState.Error.INSTANCE;
        } else {
            if (this.metadataList.isEmpty()) {
                this.metadataList.add(new ThreadMetadataOverride("Member Count", Integer.valueOf(this.thread.BRT()), Integer.TYPE, ThreadMetadataOverrideViewModel$fetch$1.INSTANCE));
            }
            r2 = this._viewState;
            success = new ViewState.Success(this.metadataList);
        }
        r2.Epw(success);
    }

    public final 2Fk getViewState() {
        return this.viewState;
    }

    public final void reset() {
        String str;
        this.metadataList.clear();
        ThreadMetadataOverrideStore store = getStore();
        AnonymousClass3U9 r0 = this.thread;
        if (r0 != null) {
            str = r0.C6C();
        } else {
            str = null;
        }
        store.reset(str);
    }

    public final void save() {
        AnonymousClass3U9 r5 = this.thread;
        if (r5 != null) {
            AnonymousClass3U9 r4 = getStore().get(r5.C6C());
            if (r4 == null) {
                r4 = new AnonymousClass3U9(this.userSession, r5.A02.clone());
            }
            List list = this.metadataList;
            ArrayList<ThreadMetadataOverride> A1C = AnonymousClass7TE.A1C();
            for (Object next : list) {
                if (((ThreadMetadataOverride) next).hasOverridden) {
                    A1C.add(next);
                }
            }
            for (ThreadMetadataOverride threadMetadataOverride : A1C) {
                threadMetadataOverride.onSave.invoke(threadMetadataOverride, r4);
                getStore().update(r5.C6C(), r4);
            }
        }
    }

    public final void update() {
        this._viewState.Epw(ViewState.Loading.INSTANCE);
        fetch();
    }

    public abstract class ViewState {

        public final class Error extends ViewState {
            public static final Error INSTANCE = new Object();
        }

        public final class Loading extends ViewState {
            public static final Loading INSTANCE = new Object();
        }

        public final class Success extends ViewState {
            public final List items;

            public Success(List list) {
                0qQ.A0B(list, 1);
                this.items = list;
            }

            public final List component1() {
                return this.items;
            }

            public final Success copy(List list) {
                0qQ.A0B(list, 0);
                return new Success(list);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Success) && 0qQ.A0K(this.items, ((Success) obj).items));
            }

            public int hashCode() {
                return this.items.hashCode();
            }

            public String toString() {
                return super.toString();
            }

            public static /* synthetic */ Success copy$default(Success success, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = success.items;
                }
                0qQ.A0B(list, 0);
                return new Success(list);
            }

            public final List getItems() {
                return this.items;
            }
        }

        public /* synthetic */ ViewState(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public ViewState() {
        }
    }
}
