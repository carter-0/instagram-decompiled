package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.List;

/* renamed from: X.7or  reason: invalid class name and case insensitive filesystem */
public final class C342597or extends 1P0 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C339697k1 A01;

    public C342597or(UserSession userSession, C339697k1 r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-86475522);
        C342577op r6 = (C342577op) obj;
        int A032 = AnonymousClass0fD.A03(-1247932285);
        0qQ.A0B(r6, 0);
        List list = C339637jv.A00(this.A00).A01;
        C339697k1 r1 = this.A01;
        list.clear();
        ImmutableList copyOf = ImmutableList.copyOf((Collection) r6.A01);
        0qQ.A07(copyOf);
        list.addAll(copyOf);
        if (r1 != null) {
            r1.onSuccess();
        }
        AnonymousClass0fD.A0A(335522455, A032);
        AnonymousClass0fD.A0A(1435223456, A03);
    }
}
