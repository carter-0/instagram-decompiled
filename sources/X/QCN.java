package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;

public final class QCN extends Fragment implements C41825B2g {
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public C7364Q8h A04;
    public WeakReference A05 = C51965G9l.A0v((Object) null);
    public WeakReference A06 = C51965G9l.A0v((Object) null);
    public WeakReference A07 = C51965G9l.A0v((Object) null);
    public boolean A08;
    public boolean A09;
    public C40161AUb A0A;

    public final void D07(Exception exc) {
        0qQ.A0B(exc, 0);
        C41825B2g b2g = (C41825B2g) this.A06.get();
        if (b2g != null) {
            b2g.D07(exc);
        }
    }

    public final void D0G() {
        this.A08 = false;
        this.A09 = false;
    }

    public final C40161AUb A00() {
        C40161AUb aUb = this.A0A;
        if (aUb != null) {
            return aUb;
        }
        0qQ.A0F("cameraController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D0B() {
        C40161AUb A002 = A00();
        ((C345697tw) A002.A00.Ape(C345697tw.A00)).EP5(false);
        C41825B2g b2g = (C41825B2g) this.A06.get();
        if (b2g != null) {
            b2g.D0B();
        }
    }

    public final void D0C(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        C41825B2g b2g = (C41825B2g) this.A06.get();
        if (b2g != null) {
            b2g.D0C(str, str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        if (r4.getBoolean("use_camera2") == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        r8.A0A = X.C392479us.A00(X.DbT.A05(requireActivity()), new X.Sls(r8), r5, r2);
        X.C40161AUb.A00(A00()).EqJ(r7);
        X.C40161AUb.A00(A00()).Efh(r6);
        X.C40161AUb.A00(A00()).Ega(921600);
        X.C40161AUb.A00(A00()).Efj(false);
        A00();
        X.C40161AUb.A00(A00()).Eew(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009c, code lost:
        if (r4 == null) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a4, code lost:
        if (r4.containsKey("initial_camera_facing") == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a6, code lost:
        A00().A03(r4.getInt("initial_camera_facing"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b1, code lost:
        X.AnonymousClass0fD.A09(-2084034932, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b9, code lost:
        if (r4 != null) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = 81136274(0x4d60a92, float:5.0320866E-36)
            int r3 = X.AnonymousClass0fD.A02(r0)
            X.QCN.super.onCreate(r9)
            android.os.Bundle r4 = r8.mArguments
            java.lang.String r1 = "photo_quality"
            r6 = 1048576(0x100000, float:1.469368E-39)
            if (r4 == 0) goto L_0x001d
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x001d
            int r6 = r4.getInt(r1)
        L_0x001d:
            java.lang.String r1 = "video_quality"
            r7 = 921600(0xe1000, float:1.291437E-39)
            if (r4 == 0) goto L_0x00b8
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x002f
            int r7 = r4.getInt(r1)
        L_0x002f:
            r0 = 1923(0x783, float:2.695E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x00b8
            java.lang.Integer r5 = X.DbV.A0o(r4, r1)
        L_0x003f:
            java.lang.String r0 = "use_camera2"
            boolean r0 = r4.getBoolean(r0)
            r2 = 1
            if (r0 != 0) goto L_0x004a
        L_0x0049:
            r2 = 0
        L_0x004a:
            androidx.fragment.app.FragmentActivity r0 = r8.requireActivity()
            android.content.Context r1 = X.DbT.A05(r0)
            X.Sls r0 = new X.Sls
            r0.<init>(r8)
            X.AUb r0 = X.C392479us.A00(r1, r0, r5, r2)
            r8.A0A = r0
            X.AUb r0 = r8.A00()
            X.7tn r0 = X.C40161AUb.A00(r0)
            r0.EqJ(r7)
            X.AUb r0 = r8.A00()
            X.7tn r0 = X.C40161AUb.A00(r0)
            r0.Efh(r6)
            X.AUb r0 = r8.A00()
            r1 = 921600(0xe1000, float:1.291437E-39)
            X.7tn r0 = X.C40161AUb.A00(r0)
            r0.Ega(r1)
            X.AUb r0 = r8.A00()
            r1 = 0
            X.7tn r0 = X.C40161AUb.A00(r0)
            r0.Efj(r1)
            r8.A00()
            X.AUb r0 = r8.A00()
            r1 = 1
            X.7tn r0 = X.C40161AUb.A00(r0)
            r0.Eew(r1)
            if (r4 == 0) goto L_0x00b1
            java.lang.String r2 = "initial_camera_facing"
            boolean r0 = r4.containsKey(r2)
            if (r0 == 0) goto L_0x00b1
            X.AUb r1 = r8.A00()
            int r0 = r4.getInt(r2)
            r1.A03(r0)
        L_0x00b1:
            r0 = -2084034932(0xffffffff83c8268c, float:-1.1763793E-36)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        L_0x00b8:
            r5 = 0
            if (r4 == 0) goto L_0x0049
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QCN.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(353358398);
        0qQ.A0B(layoutInflater, 0);
        C40161AUb A002 = A00();
        layoutInflater.getContext();
        this.A03 = A002.A01();
        Context context = layoutInflater.getContext();
        0qQ.A07(context);
        View view = this.A03;
        if (view == null) {
            0qQ.A0F("cameraView");
            throw AnonymousClass00P.createAndThrow();
        }
        C7364Q8h q8h = new C7364Q8h(context, view);
        this.A04 = q8h;
        AnonymousClass0fD.A09(-171581856, A022);
        return q8h;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1883523376);
        A00().destroy();
        QCN.super.onDestroy();
        AnonymousClass0fD.A09(-80440167, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(155202147);
        A00().pause();
        A00().A05(this);
        QCN.super.onPause();
        AnonymousClass0fD.A09(-1192464501, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1197845324);
        QCN.super.onResume();
        A00().A04(this);
        A00().EIx();
        AnonymousClass0fD.A09(-1263619329, A022);
    }
}
