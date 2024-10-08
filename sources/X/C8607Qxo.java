package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Qxo  reason: case insensitive filesystem */
public abstract class C8607Qxo extends QAN {
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;

    public final int A0E() {
        return ((ULT) ((C7614QQe) this).A02.A02).A03;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, androidx.fragment.app.Fragment, X.0SM, java.lang.Object, X.Qxo] */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        if (r2 != null) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttach(android.content.Context r7) {
        /*
            r6 = this;
            r5 = 0
            X.0qQ.A0B(r7, r5)
            X.C8607Qxo.super.onAttach(r7)
            android.os.Bundle r3 = r6.mArguments
            r4 = 0
            if (r3 == 0) goto L_0x0068
            java.lang.Class<com.facebook.oxygen.preloads.integration.install.bottomsheet.BottomSheetFeatures> r2 = com.facebook.oxygen.preloads.integration.install.bottomsheet.BottomSheetFeatures.class
            java.lang.String r0 = "CREATOR"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)
            java.lang.Object r1 = r0.get(r4)
            boolean r0 = r1 instanceof android.os.Parcelable.Creator
            if (r0 == 0) goto L_0x006b
            android.os.Parcelable$Creator r1 = (android.os.Parcelable.Creator) r1
            if (r1 == 0) goto L_0x006b
            java.lang.String r0 = "features"
            android.os.Parcelable r0 = r3.getParcelable(r0)
            java.lang.Object r2 = X.0B0.A01(r1, r0, r2)
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            com.facebook.oxygen.preloads.integration.install.bottomsheet.BottomSheetFeatures r2 = (com.facebook.oxygen.preloads.integration.install.bottomsheet.BottomSheetFeatures) r2
            if (r2 == 0) goto L_0x0068
        L_0x0030:
            X.0eM r0 = r6.A00
            java.lang.Object r1 = r0.getValue()
            X.QD9 r1 = (X.QD9) r1
            java.lang.Integer r0 = r2.A00
            X.0qQ.A0B(r0, r5)
            r1.A00 = r0
            X.0eM r3 = r6.A01
            X.Jfk r2 = X.Pxh.A0O(r3)
            android.os.Bundle r1 = r6.mArguments
            if (r1 == 0) goto L_0x0050
            java.lang.String r0 = "utm"
            android.os.Bundle r4 = r1.getBundle(r0)
        L_0x0050:
            X.SOK r0 = X.SOK.A00(r4)
            r2.A00 = r0
            X.Jfk r0 = X.Pxh.A0O(r3)
            X.2Fk r2 = r0.A03
            r0 = 31
            X.TY5 r1 = new X.TY5
            r1.<init>(r6, r0)
            r0 = 4
            X.Dba.A16(r6, r2, r1, r0)
            return
        L_0x0068:
            com.facebook.oxygen.preloads.integration.install.bottomsheet.BottomSheetFeatures r2 = com.facebook.oxygen.preloads.integration.install.bottomsheet.BottomSheetFeatures.A01
            goto L_0x0030
        L_0x006b:
            r0 = 90
            java.lang.String r1 = X.C66579MXk.A00(r0)
            java.util.Map r0 = X.0Yh.A03
            java.lang.String r0 = X.0q1.A01(r2)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8607Qxo.onAttach(android.content.Context):void");
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        0qQ.A0B(dialogInterface, 0);
        A02(AnonymousClass05K.A1F, AnonymousClass05K.A01, DbW.A1b("supportStatus", RW2.A00(Pxh.A0O(this.A01).A0A)));
        C8607Qxo.super.onDismiss(dialogInterface);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.Qxo] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        try {
            0hq childFragmentManager = getChildFragmentManager();
            int A0B = Pxj.A0B(childFragmentManager, this);
            if (!(childFragmentManager.A0P(A0B) instanceof C7414QBy)) {
                0s1 A0O = Pxj.A0O(this);
                A0O.A0G(C7414QBy.class, A0B);
                A0O.A00();
            }
            Dba.A16(this, Pxh.A0O(this.A01).A07, new TY5(this, 32), 4);
        } catch (Throwable th) {
            this.A05.Ew3("OxygenInstallSDK_UnexpectedException", th);
            A0G();
        }
    }

    private final void A02(Integer num, Integer num2, 0eP... r6) {
        Class<?> cls;
        Integer num3;
        C60104Jfk A0O = Pxh.A0O(this.A01);
        0hq childFragmentManager = getChildFragmentManager();
        Fragment A0P = childFragmentManager.A0P(Pxj.A0B(childFragmentManager, this));
        if (A0P != null) {
            cls = A0P.getClass();
        } else {
            cls = null;
        }
        if (!0qQ.A0K(cls, C8607Qxo.class)) {
            if (0qQ.A0K(cls, C7414QBy.class)) {
                num3 = AnonymousClass05K.A00;
            } else if (0qQ.A0K(cls, C7415QBz.class)) {
                num3 = AnonymousClass05K.A01;
            } else if (0qQ.A0K(cls, QC0.class)) {
                num3 = AnonymousClass05K.A0Y;
            } else if (0qQ.A0K(cls, C7411QBv.class)) {
                num3 = AnonymousClass05K.A0N;
            } else if (0qQ.A0K(cls, C7410QBu.class)) {
                num3 = AnonymousClass05K.A0C;
            }
            Pxj.A1F(A0O, num, num2, num3, r6);
        }
        num3 = AnonymousClass05K.A0j;
        Pxj.A1F(A0O, num, num2, num3, r6);
    }

    public final void A0G() {
        Integer num = AnonymousClass05K.A1I;
        Integer num2 = AnonymousClass05K.A01;
        AnonymousClass0eM r2 = this.A01;
        A02(num, num2, DbW.A1b("supportStatus", RW2.A00(Pxh.A0O(r2).A0A)));
        C60104Jfk A0O = Pxh.A0O(r2);
        C10217RoY roY = ((C7614QQe) this).A03;
        String str = A0O.A00.A05;
        0qQ.A07(str);
        0qQ.A07(A0O.A00.A04);
        0qQ.A07(A0O.A00.A00);
        0oI.A07(roY.A00.requireActivity(), "com.instagram.barcelona", str);
        A07();
    }

    public C8607Qxo() {
        C13350TVx tVx = new C13350TVx(this, 48);
        C13350TVx tVx2 = new C13350TVx(this, 49);
        0eO r7 = 0eO.A02;
        AnonymousClass0eM A002 = C13348TVv.A00(tVx2, r7, 0);
        this.A01 = new C227862kA(new C13348TVv(A002, 1), tVx, new TTP(34, (Object) null, A002), DbS.A0z(C60104Jfk.class));
        C13350TVx tVx3 = new C13350TVx(this, 47);
        AnonymousClass0eM A003 = C13348TVv.A00(new C13348TVv(this, 2), r7, 3);
        this.A00 = new C227862kA(new C13348TVv(A003, 4), tVx3, new TTP(35, (Object) null, A003), DbS.A0z(QD9.class));
    }

    public static final void A01(C8607Qxo qxo) {
        Intent intent;
        PackageManager packageManager;
        FragmentActivity activity = qxo.getActivity();
        if (activity == null || (packageManager = activity.getPackageManager()) == null) {
            intent = null;
        } else {
            intent = packageManager.getLaunchIntentForPackage(Pxh.A0O(qxo.A01).A08.A00());
        }
        boolean A0G = 0b6.A00().A05().A0G(qxo.getActivity(), intent);
        qxo.A02(AnonymousClass05K.A02, AnonymousClass05K.A01, JTQ.A1b("supportStatus", RW2.A00(Pxh.A0O(qxo.A01).A0A), AnonymousClass7TE.A1L("isLaunched", String.valueOf(A0G))));
        qxo.A07();
    }

    public final Dialog A0F(Bundle bundle) {
        return new C8604Qxl(requireContext(), this, A0E());
    }

    public final boolean A0H() {
        0hq childFragmentManager = getChildFragmentManager();
        if (!(childFragmentManager.A0P(Pxj.A0B(childFragmentManager, this)) instanceof QC0)) {
            return false;
        }
        A02(AnonymousClass05K.A0Y, AnonymousClass05K.A00, new 0eP[0]);
        0hq childFragmentManager2 = getChildFragmentManager();
        0qQ.A07(childFragmentManager2);
        return childFragmentManager2.A19("javaClass", 1);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        int i;
        String str;
        int A02 = AnonymousClass0fD.A02(-1515803724);
        0qQ.A0B(layoutInflater, 0);
        A02(AnonymousClass05K.A15, AnonymousClass05K.A01, new 0eP[0]);
        AnonymousClass0eM r6 = this.A01;
        int intValue = Pxh.A0O(r6).A0A.intValue();
        if (intValue != 1) {
            inflate = null;
            C13712Tfa tfa = ((C7614QQe) this).A05;
            if (intValue != 3) {
                Integer num = Pxh.A0O(r6).A0A;
                if (num != null) {
                    str = RW2.A00(num);
                } else {
                    str = "null";
                }
                tfa.Ew0("OxygenInstallSDK_SupportStatus", 002.A0R("Fallback on supportStatus = ", str));
                A0G();
                i = -1796309454;
            } else {
                tfa.Ew0("OxygenInstallSDK_AppInstalled", "Install isn't needed since app is already installed");
                A01(this);
                i = -429424700;
            }
        } else {
            inflate = layoutInflater.inflate(((ULT) ((C7614QQe) this).A02.A02).A02, viewGroup, false);
            i = -886476398;
        }
        AnonymousClass0fD.A09(i, A02);
        return inflate;
    }
}
