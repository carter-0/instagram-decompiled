package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.Ufb  reason: case insensitive filesystem */
public final class C15609Ufb extends 1P0 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ DialogInterface.OnDismissListener A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ AnonymousClass0iw A03;
    public final /* synthetic */ AnonymousClass6ZA A04;
    public final /* synthetic */ AnonymousClass6ZF A05;
    public final /* synthetic */ XCI A06;
    public final /* synthetic */ X4S A07;
    public final /* synthetic */ X4T A08;
    public final /* synthetic */ X4U A09;
    public final /* synthetic */ C19201WPh A0A;
    public final /* synthetic */ C273414mX A0B;
    public final /* synthetic */ User A0C;
    public final /* synthetic */ AnonymousClass6ZK A0D;
    public final /* synthetic */ AnonymousClass6ZH A0E;
    public final /* synthetic */ AnonymousClass6ZC A0F;
    public final /* synthetic */ AnonymousClass6ZJ A0G;
    public final /* synthetic */ AnonymousClass6ZI A0H;

    public C15609Ufb(Context context, DialogInterface.OnDismissListener onDismissListener, View view, AnonymousClass0iw r5, AnonymousClass6ZA r6, AnonymousClass6ZF r7, XCI xci, X4S x4s, X4T x4t, X4U x4u, C19201WPh wPh, C273414mX r13, User user, AnonymousClass6ZK r15, AnonymousClass6ZH r16, AnonymousClass6ZC r17, AnonymousClass6ZJ r18, AnonymousClass6ZI r19) {
        this.A0A = wPh;
        this.A0C = user;
        this.A00 = context;
        this.A02 = view;
        this.A04 = r6;
        this.A06 = xci;
        this.A01 = onDismissListener;
        this.A05 = r7;
        this.A0D = r15;
        this.A0F = r17;
        this.A0E = r16;
        this.A0H = r19;
        this.A0G = r18;
        this.A03 = r5;
        this.A0B = r13;
        this.A09 = x4u;
        this.A08 = x4t;
        this.A07 = x4s;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A032 = AnonymousClass0fD.A03(1547056824);
        AnonymousClass370 r1 = (AnonymousClass370) obj;
        int A033 = AnonymousClass0fD.A03(219190256);
        0qQ.A0B(r1, 0);
        User A002 = C324696zk.A00(r1);
        if (A002 == null) {
            onFail(new C268674do(r1));
            i = 346114507;
        } else {
            C19201WPh wPh = this.A0A;
            17h.A00(wPh.A0B).A01(A002, true, false);
            this.A0C.A0q(A002.A0N());
            Context context = this.A00;
            View view = this.A02;
            AnonymousClass6ZA r15 = this.A04;
            XCI xci = this.A06;
            DialogInterface.OnDismissListener onDismissListener = this.A01;
            AnonymousClass6ZF r8 = this.A05;
            AnonymousClass6ZK r7 = this.A0D;
            AnonymousClass6ZC r6 = this.A0F;
            AnonymousClass6ZH r5 = this.A0E;
            AnonymousClass6ZI r4 = this.A0H;
            AnonymousClass6ZJ r3 = this.A0G;
            AnonymousClass0iw r2 = this.A03;
            C273414mX r12 = this.A0B;
            X4T x4t = this.A08;
            AnonymousClass6ZA r18 = r15;
            AnonymousClass6ZF r19 = r8;
            AnonymousClass0iw r17 = r2;
            Context context2 = context;
            DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
            C19201WPh wPh2 = wPh;
            wPh2.A0Y(context2, onDismissListener2, view, r17, r18, r19, xci, this.A07, x4t, r12, r7, r5, r6, r3, r4);
            i = 1404457662;
        }
        AnonymousClass0fD.A0A(i, A033);
        AnonymousClass0fD.A0A(1330358415, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-668175322);
        C15609Ufb.super.onFinish();
        SQH.A01(this.A0A.A07);
        AnonymousClass0fD.A0A(-1149609718, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(-48906741);
        C15609Ufb.super.onStart();
        SQH.A02(this.A0A.A07);
        AnonymousClass0fD.A0A(936863454, A032);
    }
}
