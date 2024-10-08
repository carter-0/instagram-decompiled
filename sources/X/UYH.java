package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class UYH extends C15331Uag {
    public static final String __redex_internal_original_name = "ArDynamicAdsCameraFragment";
    public View A00;
    public View A01;
    public C18555Vu7 A02;
    public C297775sJ A03;
    public C20946X5p A04;
    public VLA A05;
    public AS8 A06;
    public C17825Vge A07;
    public VVD A08;
    public Integer A09;
    public C16854V8j A0A;
    public final C17955Vim A0B = new C17955Vim(this);
    public final AnonymousClass0eM A0C = AnonymousClass0eN.A01(new MMI(this, 43));

    public final String getModuleName() {
        return AnonymousClass000.A00(3365);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C297775sJ r1 = this.A03;
        if (r1 == null) {
            str = "arAdsDataStore";
        } else {
            String str2 = A03().A07;
            if (str2 != null) {
                C15032UKl A002 = r1.A00(str2);
                if (A002 != null) {
                    C17825Vge vge = this.A07;
                    if (vge == null) {
                        str = "productCardViewController";
                    } else {
                        vge.A00(A002, A03().A02, A03().A01);
                    }
                }
                C40161AUb.A00(A01().A03.A09).EUU(false);
                ViewGroup viewGroup = this.A00;
                if (viewGroup != null) {
                    int dimension = (int) viewGroup.getResources().getDimension(R.dimen.asset_picker_redesign_sticker_height);
                    ViewGroup viewGroup2 = this.A00;
                    if (viewGroup2 != null) {
                        0nA.A0T(viewGroup2, dimension);
                        C17955Vim vim = this.A0B;
                        int intValue = A04().intValue();
                        if (intValue == 1) {
                            vim.A00();
                            return;
                        } else if (intValue == 0) {
                            vim.A01();
                            return;
                        } else {
                            return;
                        }
                    }
                }
                str = "instructionView";
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.V8j] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = -960809240(0xffffffffc6bb36e8, float:-23963.453)
            int r1 = X.AnonymousClass0fD.A02(r0)
            super.onCreate(r6)
            android.os.Bundle r3 = r5.mArguments
            r2 = 1
            if (r3 == 0) goto L_0x003b
            java.lang.String r0 = "is_test_link"
            boolean r0 = r3.getBoolean(r0)
            if (r0 != r2) goto L_0x003b
            X.1ZO r2 = X.AnonymousClass1ZO.A03
            if (r2 != 0) goto L_0x0025
            java.lang.String r0 = "instance"
        L_0x001d:
            X.0qQ.A0F(r0)
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x0025:
            X.0eM r0 = r5.A0M
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            r4 = 0
            X.0qQ.A0B(r0, r4)
            X.X5p r3 = r2.A00
            if (r3 != 0) goto L_0x0054
            X.WFn r3 = new X.WFn
            r3.<init>(r2, r0)
            r2.A00 = r3
            goto L_0x0054
        L_0x003b:
            X.1ZN r2 = X.C297725sE.A00()
            X.0eM r0 = r5.A0M
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            r4 = 0
            X.0qQ.A0B(r0, r4)
            X.X5p r3 = r2.A00
            if (r3 != 0) goto L_0x0054
            X.WFm r3 = new X.WFm
            r3.<init>(r2, r0)
            r2.A00 = r3
        L_0x0054:
            r5.A04 = r3
            X.5sJ r2 = r3.E4q()
            r5.A03 = r2
            if (r2 != 0) goto L_0x0061
            java.lang.String r0 = "arAdsDataStore"
            goto L_0x001d
        L_0x0061:
            X.VLA r0 = new X.VLA
            r0.<init>(r2)
            r5.A05 = r0
            X.V8j r0 = new X.V8j
            r0.<init>()
            r5.A0A = r0
            android.os.Bundle r2 = r5.mArguments
            if (r2 == 0) goto L_0x00de
            java.lang.String r0 = "mode"
            java.lang.String r3 = X.JTP.A0m(r2, r0)
            X.V8j r0 = r5.A0A
            if (r0 != 0) goto L_0x0080
            java.lang.String r0 = "arCommerceCameraModeProvider"
            goto L_0x001d
        L_0x0080:
            X.0qQ.A0B(r3, r4)
            int r2 = r3.hashCode()
            r0 = -1883789524(0xffffffff8fb7a72c, float:-1.8109585E-29)
            if (r2 == r0) goto L_0x00db
            r0 = -1883788084(0xffffffff8fb7accc, float:-1.8111752E-29)
            if (r2 == r0) goto L_0x00d8
            r0 = 52229(0xcc05, float:7.3188E-41)
            if (r2 != r0) goto L_0x00d8
            java.lang.String r0 = "3dv"
        L_0x0098:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d8
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x00a0:
            X.0qQ.A0B(r0, r4)
            r5.A0F = r0
            r0 = -1883789524(0xffffffff8fb7a72c, float:-1.8109585E-29)
            if (r2 == r0) goto L_0x00ca
            r0 = -1883788084(0xffffffff8fb7accc, float:-1.8111752E-29)
            if (r2 == r0) goto L_0x00c7
            r0 = 52229(0xcc05, float:7.3188E-41)
            if (r2 != r0) goto L_0x00d5
            java.lang.String r0 = "3dv"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d5
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x00be:
            r5.A09 = r0
            r0 = 310258914(0x127e2ce2, float:8.020359E-28)
            X.AnonymousClass0fD.A09(r0, r1)
            return
        L_0x00c7:
            java.lang.String r0 = "ar3d_default_ar"
            goto L_0x00cc
        L_0x00ca:
            java.lang.String r0 = "ar3d_default_3d"
        L_0x00cc:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d5
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x00be
        L_0x00d5:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x00be
        L_0x00d8:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x00a0
        L_0x00db:
            java.lang.String r0 = "ar3d_default_3d"
            goto L_0x0098
        L_0x00de:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r0 = 472010843(0x1c22505b, float:5.370516E-22)
            X.AnonymousClass0fD.A09(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UYH.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1638420914);
        0qQ.A0B(layoutInflater, 0);
        View A0A2 = DbU.A0A(layoutInflater, viewGroup, R.layout.ar_dynamic_ads_camera_fragment_layout, false);
        C17825Vge vge = new C17825Vge(DbU.A0Y(A0A2, R.id.product_card_stub));
        vge.A01 = new VM1(this);
        this.A07 = vge;
        Integer num = this.A09;
        if (num == null) {
            0qQ.A0F("effectMode");
            throw AnonymousClass00P.createAndThrow();
        }
        if (num == AnonymousClass05K.A0C) {
            View requireViewById = A0A2.requireViewById(R.id.ar_3d_toggle_button);
            this.A00 = requireViewById.requireViewById(R.id.arlayout);
            this.A01 = requireViewById;
            0qQ.A0C(requireViewById, "null cannot be cast to non-null type com.facebook.arcommercecamera.interfaces.CommerceCameraToggleButton");
            C18555Vu7 vu7 = new C18555Vu7((X2I) requireViewById, new VM2(this), this, A04());
            ((View) vu7.A01).setVisibility(0);
            this.A02 = vu7;
            this.A08 = new VVD(requireActivity(), AnonymousClass7TE.A0l(this.A0M));
        }
        AnonymousClass0fD.A09(-2133159382, A022);
        return A0A2;
    }
}
