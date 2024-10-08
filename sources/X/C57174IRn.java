package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.IRn  reason: case insensitive filesystem */
public final class C57174IRn implements JPN {
    public final Fragment A00;
    public final UserSession A01;
    public final AnonymousClass311 A02;
    public final AnonymousClass4DU A03;
    public final String A04;
    public final String A05;

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0091 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(X.HOY r9, X.C263944Ny r10, X.1Xj r11, java.lang.Boolean r12, java.lang.Long r13, java.lang.String r14, int r15) {
        /*
            r8 = this;
            r7 = 0
            if (r14 == 0) goto L_0x0111
            int r1 = r14.hashCode()
            r0 = -1965110553(0xffffffff8adecae7, float:-2.1454146E-32)
            if (r1 == r0) goto L_0x00f5
            r0 = 1286271486(0x4caaf1fe, float:8.962456E7)
            if (r1 == r0) goto L_0x00dd
            r0 = 1385468589(0x529492ad, float:3.19057986E11)
            if (r1 != r0) goto L_0x0111
            java.lang.String r0 = "rounded"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0111
            if (r12 == 0) goto L_0x0111
            boolean r0 = r12.booleanValue()
            if (r0 == 0) goto L_0x0111
            java.lang.String r6 = "tappable_rounded"
        L_0x0028:
            com.instagram.common.session.UserSession r3 = r8.A01
            X.4DU r2 = r8.A03
            X.0wc r1 = X.AnonymousClass0kN.A01(r2, r3)
            r0 = 760(0x2f8, float:1.065E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r4 = "action"
            r5.AAJ(r4, r6)
            java.lang.String r0 = X.C231122qu.A07(r3, r11)
            if (r0 == 0) goto L_0x00d9
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x00d9
            long r0 = r0.longValue()
        L_0x004f:
            X.C51970G9q.A17(r5, r0)
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0u()
            java.lang.String r0 = "is_checkout_enabled"
            r5.A7p(r0, r1)
            java.lang.String r0 = "is_tappable"
            r5.A7p(r0, r12)
            if (r10 == 0) goto L_0x00d7
            java.lang.Long r1 = r10.A00
        L_0x0064:
            java.lang.String r0 = "merchant_id"
            r5.A9F(r0, r1)
            java.lang.String r1 = r11.getId()
            java.lang.String r0 = "m_pk"
            X.C51974G9v.A0p(r5, r11, r0, r1)
            java.lang.String r0 = "product_id"
            r5.A9F(r0, r13)
            java.lang.String r0 = "tile_style"
            r5.AAJ(r0, r14)
            java.lang.String r0 = r11.A2v()
            X.C51965G9l.A1L(r5, r0)
            java.lang.String r0 = "tap_destination"
            r5.A8M(r9, r0)
            r5.Cgf()
            boolean r0 = r11.CcK()
            if (r0 == 0) goto L_0x00d6
            if (r13 != 0) goto L_0x00af
            java.util.List r0 = r11.A3W()
            int r0 = r0.size()
            if (r15 >= r0) goto L_0x00af
            java.util.List r0 = r11.A3W()
            X.1Xj r0 = X.DbZ.A0T(r0, r15)
            if (r0 == 0) goto L_0x00ab
            java.lang.String r7 = r0.A2n()
        L_0x00ab:
            java.lang.Long r13 = X.C254543se.A00(r7)
        L_0x00af:
            java.lang.String r6 = "collection_tile_product"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            X.0jB r5 = X.C51965G9l.A0k()
            X.0j9 r1 = X.C271774jZ.A1K
            java.lang.Long r0 = X.C51968G9o.A0v(r0)
            r5.A04(r1, r0)
            X.0j9 r0 = X.C271774jZ.A1P
            r5.A04(r0, r13)
            r1 = 0
            X.3sc r0 = X.C233822wX.A01(r1, r11, r2, r4)
            r0.A0J(r3, r11)
            r0.A0n = r5
            r0.A5K = r6
            X.C233822wX.A0C(r3, r0, r11, r2, r1)
        L_0x00d6:
            return
        L_0x00d7:
            r1 = r7
            goto L_0x0064
        L_0x00d9:
            r0 = 0
            goto L_0x004f
        L_0x00dd:
            java.lang.String r0 = "rounded_border"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0111
            if (r12 == 0) goto L_0x0111
            boolean r0 = r12.booleanValue()
            if (r0 == 0) goto L_0x0111
            r0 = 990(0x3de, float:1.387E-42)
            java.lang.String r6 = X.C273654mx.A00(r0)
            goto L_0x0028
        L_0x00f5:
            java.lang.String r0 = "squared"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0111
            if (r12 == 0) goto L_0x0111
            boolean r0 = r12.booleanValue()
            if (r0 == 0) goto L_0x0109
            java.lang.String r6 = "tappable_squared"
            goto L_0x0028
        L_0x0109:
            r0 = 842(0x34a, float:1.18E-42)
            java.lang.String r6 = X.C273654mx.A00(r0)
            goto L_0x0028
        L_0x0111:
            r6 = r7
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57174IRn.A00(X.HOY, X.4Ny, X.1Xj, java.lang.Boolean, java.lang.Long, java.lang.String, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0055, code lost:
        if (r2 != false) goto L_0x0057;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dky(android.view.View r34, X.AnonymousClass3V2 r35, X.1Xj r36, X.1Xj r37, X.AnonymousClass3W1 r38, int r39) {
        /*
            r33 = this;
            r4 = 0
            r3 = r36
            X.0qQ.A0B(r3, r4)
            r5 = 1
            r7 = r35
            r12 = r37
            r6 = r38
            X.DbZ.A0t(r5, r12, r7, r6)
            r0 = r33
            androidx.fragment.app.Fragment r10 = r0.A00
            androidx.fragment.app.FragmentActivity r14 = r10.getActivity()
            if (r14 != 0) goto L_0x001b
            return
        L_0x001b:
            r11 = 0
            r24 = r39
            int r2 = r39 + 1
            X.1Xy r1 = r3.A0C
            java.util.List r1 = r1.Aok()
            java.lang.String r8 = "Required value was null."
            if (r1 == 0) goto L_0x0280
            X.1Xj r1 = X.DbZ.A0T(r1, r2)
            X.1Xy r1 = r1.A0C
            X.56P r13 = r1.C4I()
            if (r13 != 0) goto L_0x004a
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r4)
            java.lang.String r23 = "squared"
            r17 = r0
            r18 = r11
            r19 = r11
            r20 = r3
            r22 = r11
            r17.A00(r18, r19, r20, r21, r22, r23, r24)
            return
        L_0x004a:
            java.util.List r1 = r13.Abc()
            if (r1 == 0) goto L_0x0057
            boolean r2 = r1.isEmpty()
            r1 = 0
            if (r2 == 0) goto L_0x0058
        L_0x0057:
            r1 = 1
        L_0x0058:
            r31 = 0
            if (r1 != 0) goto L_0x0193
            java.util.List r1 = r13.Abc()
            if (r1 == 0) goto L_0x0190
            java.lang.Object r1 = X.00k.A0J(r1)
            com.instagram.model.androidlink.AndroidLink r1 = (com.instagram.model.androidlink.AndroidLink) r1
            if (r1 == 0) goto L_0x0190
            java.lang.String r9 = r1.BFh()
        L_0x006e:
            java.util.List r1 = r13.Abc()
            if (r1 == 0) goto L_0x018d
            java.lang.Object r1 = X.00k.A0J(r1)
            com.instagram.model.androidlink.AndroidLink r1 = (com.instagram.model.androidlink.AndroidLink) r1
            if (r1 == 0) goto L_0x018d
            X.47L r2 = X.C271714jT.A01(r1)
        L_0x0080:
            X.47L r1 = X.AnonymousClass47L.AD_DESTINATION_PROFILE_VISIT
            boolean r1 = X.AnonymousClass7TF.A1W(r2, r1)
            if (r9 == 0) goto L_0x0119
            if (r1 == 0) goto L_0x0119
            com.instagram.common.session.UserSession r15 = r0.A01
            X.0Tu r8 = X.0Tu.A05
            r1 = 36329728197542182(0x8111b200004126, double:3.038404627974674E-306)
            boolean r1 = X.182.A06(r8, r15, r1)
            if (r1 == 0) goto L_0x00de
            java.lang.Boolean r29 = java.lang.Boolean.valueOf(r5)
            X.HOY r26 = X.HOY.PDP
            X.4DU r1 = r0.A03
            java.lang.String r2 = r1.getModuleName()
            java.lang.String r1 = "activity_feed"
            X.Dfc r1 = X.C46548Dgp.A01(r15, r9, r1, r2)
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r2 = X.C51973G9u.A0A(r15, r1)
            java.lang.String r1 = "profile"
            X.DbU.A0w(r14, r2, r15, r4, r1)
        L_0x00b6:
            r30 = r11
        L_0x00b8:
            com.instagram.api.schemas.CornerStyle r2 = r13.ArW()
            if (r2 == 0) goto L_0x00db
            com.instagram.api.schemas.CornerStyle r1 = com.instagram.api.schemas.CornerStyle.SQUARED
            if (r2 == r1) goto L_0x00db
            com.instagram.api.schemas.CornerStyle r1 = com.instagram.api.schemas.CornerStyle.ROUNDED
            if (r2 != r1) goto L_0x00d4
            java.lang.String r31 = "rounded"
        L_0x00c8:
            r25 = r0
            r27 = r11
            r28 = r3
            r32 = r24
            r25.A00(r26, r27, r28, r29, r30, r31, r32)
            return
        L_0x00d4:
            com.instagram.api.schemas.CornerStyle r1 = com.instagram.api.schemas.CornerStyle.ROUNDED_BORDER
            if (r2 != r1) goto L_0x00c8
            java.lang.String r31 = "rounded_border"
            goto L_0x00c8
        L_0x00db:
            java.lang.String r31 = "squared"
            goto L_0x00c8
        L_0x00de:
            r1 = 36329728197607719(0x8111b200014127, double:3.03840462801612E-306)
            boolean r1 = X.182.A06(r8, r15, r1)
            if (r1 == 0) goto L_0x025a
            java.lang.Boolean r29 = java.lang.Boolean.valueOf(r5)
            X.HOY r26 = X.HOY.PDP
            r6.A3H = r4
            X.3VF r7 = r7.A0C
            X.4DU r5 = r0.A03
            X.311 r1 = r0.A02
            X.30y r1 = (X.C2357230y) r1
            X.0eM r1 = r1.A1c
            java.lang.Object r2 = r1.getValue()
            X.Hkr r2 = (X.C55632Hkr) r2
            java.lang.String r1 = r0.A05
            android.content.Context r14 = r10.getContext()
            r22 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r1
            r17 = r12
            r16 = r2
            X.C55012Haj.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x00b6
        L_0x0119:
            java.util.List r1 = r13.Abc()
            com.instagram.common.session.UserSession r15 = r0.A01
            com.instagram.model.androidlink.AndroidLink r4 = X.AnonymousClass47K.A03(r14, r15, r1, r4)
            if (r4 == 0) goto L_0x018b
            X.47L r2 = X.C271714jT.A01(r4)
        L_0x0129:
            X.47L r1 = X.AnonymousClass47L.AD_DESTINATION_DEEPLINK
            if (r2 != r1) goto L_0x0180
            r2 = 1
            if (r4 == 0) goto L_0x0188
            java.lang.String r18 = r4.Avj()
        L_0x0134:
            java.util.List r23 = X.C231122qu.A0K(r15, r3)
            if (r18 == 0) goto L_0x025a
            int r1 = r18.length()
            if (r1 == 0) goto L_0x025a
            java.lang.Boolean r29 = java.lang.Boolean.valueOf(r5)
            if (r2 == 0) goto L_0x017d
            X.HOY r26 = X.HOY.EXTERNAL_APP
        L_0x0148:
            if (r4 == 0) goto L_0x026c
            X.47L r16 = X.C271714jT.A01(r4)
            if (r16 == 0) goto L_0x0267
            java.lang.String r19 = r3.getId()
            if (r19 == 0) goto L_0x0262
            X.4DU r1 = r0.A03
            java.lang.String r20 = r1.getModuleName()
            X.2EG r17 = X.2EG.A1D
            X.3lZ r1 = X.C51966G9m.A0w(r3)
            if (r1 == 0) goto L_0x017a
            java.lang.String r21 = r1.AZ4()
        L_0x0168:
            X.3lZ r1 = X.C51966G9m.A0w(r3)
            if (r1 == 0) goto L_0x0177
            java.lang.String r22 = r1.C9L()
        L_0x0172:
            X.FH7.A07(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x00b6
        L_0x0177:
            r22 = r11
            goto L_0x0172
        L_0x017a:
            r21 = r11
            goto L_0x0168
        L_0x017d:
            X.HOY r26 = X.HOY.IAB
            goto L_0x0148
        L_0x0180:
            r2 = 0
            if (r4 == 0) goto L_0x0188
            java.lang.String r18 = r4.CGH()
            goto L_0x0134
        L_0x0188:
            r18 = r11
            goto L_0x0134
        L_0x018b:
            r2 = r11
            goto L_0x0129
        L_0x018d:
            r2 = r11
            goto L_0x0080
        L_0x0190:
            r9 = 0
            goto L_0x006e
        L_0x0193:
            java.util.List r1 = r13.BN4()
            if (r1 == 0) goto L_0x01ed
            java.util.List r1 = r13.BN4()
            com.instagram.common.session.UserSession r15 = r0.A01
            com.instagram.model.androidlink.AndroidLink r1 = X.AnonymousClass47K.A03(r14, r15, r1, r4)
            if (r1 == 0) goto L_0x01ea
            java.lang.String r18 = r1.CGH()
        L_0x01a9:
            java.util.List r23 = X.C231122qu.A0K(r15, r3)
            if (r18 == 0) goto L_0x025a
            java.lang.Boolean r29 = java.lang.Boolean.valueOf(r5)
            X.HOY r26 = X.HOY.IAB
            if (r1 == 0) goto L_0x027b
            X.47L r16 = X.C271714jT.A01(r1)
            if (r16 == 0) goto L_0x0276
            java.lang.String r19 = r3.getId()
            if (r19 == 0) goto L_0x0271
            X.4DU r1 = r0.A03
            java.lang.String r20 = r1.getModuleName()
            X.2EG r17 = X.2EG.A1D
            X.3lZ r1 = X.C51966G9m.A0w(r3)
            if (r1 == 0) goto L_0x01e7
            java.lang.String r21 = r1.AZ4()
        L_0x01d5:
            X.3lZ r1 = X.C51966G9m.A0w(r3)
            if (r1 == 0) goto L_0x01e4
            java.lang.String r22 = r1.C9L()
        L_0x01df:
            X.FH7.A07(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x00b6
        L_0x01e4:
            r22 = r11
            goto L_0x01df
        L_0x01e7:
            r21 = r11
            goto L_0x01d5
        L_0x01ea:
            r18 = r11
            goto L_0x01a9
        L_0x01ed:
            com.instagram.user.model.ProductDetailsProductItemDictIntf r1 = r13.Bfu()
            if (r1 == 0) goto L_0x025a
            com.instagram.user.model.ProductDetailsProductItemDictIntf r1 = r13.Bfu()
            if (r1 == 0) goto L_0x025a
            com.instagram.user.model.Product r7 = X.C14502TxO.A00(r1)
            java.lang.Boolean r29 = java.lang.Boolean.valueOf(r5)
            com.instagram.common.session.UserSession r1 = r0.A01
            X.ULx r2 = X.C294165ly.A03(r1, r7)
            X.4Ny r2 = r2.A01
            java.lang.String r4 = r7.A0H
            java.lang.Long r30 = X.DbV.A0q(r4)
            X.3kF r15 = X.C249713kF.A00
            X.4DU r6 = r0.A03
            java.lang.String r4 = r0.A05
            java.lang.String r20 = "collection_ads"
            r16 = r14
            r17 = r1
            r18 = r6
            r19 = r7
            r21 = r4
            X.WNN r6 = r15.A0L(r16, r17, r18, r19, r20, r21)
            X.1Xj r8 = r3.A1e(r1)
            int r4 = r3.A15(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.A02(r8, r4)
            r6.A0b = r5
            r6.A08 = r11
            boolean r4 = X.C51968G9o.A1W(r1, r3)
            r6.A0X = r4
            X.1Xj r4 = r3.A1e(r1)
            int r1 = r3.A15(r1)
            com.instagram.model.shopping.productfeed.ProductTileMedia r1 = X.C55150Hcy.A00(r4, r7, r1)
            r6.A05 = r1
            r6.A0a = r5
            java.lang.String r1 = r0.A04
            r6.A0N = r1
            X.WNN.A01(r6)
            r26 = 0
            r11 = r2
            goto L_0x00b8
        L_0x025a:
            r30 = r11
            r29 = r11
            r26 = 0
            goto L_0x00b8
        L_0x0262:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x0267:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x026c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x0271:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x0276:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x027b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x0280:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57174IRn.Dky(android.view.View, X.3V2, X.1Xj, X.1Xj, X.3W1, int):void");
    }

    public C57174IRn(Fragment fragment, UserSession userSession, AnonymousClass311 r3, AnonymousClass4DU r4, String str, String str2) {
        this.A02 = r3;
        this.A01 = userSession;
        this.A00 = fragment;
        this.A03 = r4;
        this.A05 = str;
        this.A04 = str2;
    }

    public final boolean DrW(MotionEvent motionEvent, View view, AnonymousClass3V2 r6, 1Xj r7, AnonymousClass3W1 r8, int i) {
        AnonymousClass7TG.A1O(r6, r8);
        if (motionEvent.getAction() != 0) {
            return false;
        }
        motionEvent.setLocation(motionEvent.getX() + ((float) (view.getWidth() * i)), motionEvent.getY() + AnonymousClass7TE.A03(r6.A0F));
        r8.A0k = C54997HaU.A00(motionEvent, r6.A01);
        return false;
    }
}
