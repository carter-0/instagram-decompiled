package com.instagram.pendingmedia.service.impl;

import X.0eO;
import X.0nV;
import X.0qQ;
import X.19B;
import X.19E;
import X.1Eo;
import X.1HR;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass12V;
import X.AnonymousClass19G;
import X.AnonymousClass19S;
import X.AnonymousClass4D7;
import X.AnonymousClass9KP;
import X.AnonymousClass9LU;
import X.C2373837k;
import X.C2374537r;
import X.C2374837w;
import X.C241063Ns;
import X.C249513ju;
import X.C262204Co;
import X.C301205yj;
import X.C61410nE;
import X.C62019KVs;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class ConcurrentUploadQueueProcessor {
    public static final C2374837w A0F = new Object();
    public C262204Co A00;
    public final Context A01;
    public final UserSession A02;
    public final 0nV A03;
    public final 0nV A04;
    public final C2373837k A05;
    public final C2374537r A06;
    public final PendingMediaStore A07;
    public final Map A08;
    public final AtomicInteger A09;
    public final AnonymousClass0eM A0A = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LU(this, 37));
    public final CoroutineExceptionHandler A0B;
    public final C249513ju A0C;
    public final C249513ju A0D;
    public final C61410nE A0E = C61410nE.A00;

    public ConcurrentUploadQueueProcessor(Context context, AnonymousClass12V r7, UserSession userSession, C2373837k r9, C2374537r r10, PendingMediaStore pendingMediaStore, Map map, int i) {
        0qQ.A0B(context, 2);
        0qQ.A0B(map, 7);
        0qQ.A0B(r7, 8);
        this.A01 = context;
        this.A05 = r9;
        this.A07 = pendingMediaStore;
        this.A06 = r10;
        this.A02 = userSession;
        this.A08 = map;
        0nV A002 = r7.CO6(319, 2).A00(i + 1);
        this.A03 = A002;
        this.A04 = A002.A00(i);
        this.A09 = new AtomicInteger(0);
        Integer num = AnonymousClass05K.A00;
        this.A0D = new 1HR(Integer.MAX_VALUE);
        this.A0C = new 1HR(Integer.MAX_VALUE);
        this.A0B = new ConcurrentUploadQueueProcessor$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key);
        C262204Co r0 = this.A00;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        AnonymousClass19S A022 = 19E.A02(this.A03.plus(this.A0B).plus(new AnonymousClass19G((C262204Co) null)));
        this.A00 = 1Eo.A03(num, 19B.A00, new AnonymousClass9KP(this, (AnonymousClass4D7) null, 11), A022);
    }

    public final C241063Ns A00(C62019KVs kVs) {
        0qQ.A0B(kVs, 0);
        C301205yj.A00(kVs, this.A0D);
        return kVs.A04;
    }
}
