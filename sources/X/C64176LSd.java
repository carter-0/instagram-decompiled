package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.graphql.IGDMediaCollageMutationResponseImpl;

/* renamed from: X.LSd  reason: case insensitive filesystem */
public final class C64176LSd {
    public static final C64176LSd A00 = new Object();

    public static final Bitmap A00(Medium medium, double d) {
        int i;
        0qQ.A0B(medium, 0);
        Bitmap decodeFile = BitmapFactory.decodeFile(medium.A0X);
        int A0M = new C227922kK(medium.A0X).A0M("Orientation", 1);
        if (A0M == 3) {
            i = 180;
        } else if (A0M != 6) {
            i = 270;
            if (A0M != 8) {
                i = 0;
            }
        } else {
            i = 90;
        }
        int width = decodeFile.getWidth();
        int height = decodeFile.getHeight();
        double d2 = (double) (width / height);
        if (d < d2) {
            width = (int) (((double) height) * d);
        } else if (d > d2) {
            height = (int) (((double) width) / d);
        }
        Bitmap A09 = 1MF.A09(decodeFile, width, height, i, false);
        0qQ.A07(A09);
        return A09;
    }

    public static final void A01(Context context, Bitmap bitmap, UserSession userSession, String str, String str2, String str3) {
        BitmapDrawable bitmapDrawable;
        C249463jp r1;
        Context context2 = context;
        Bitmap bitmap2 = bitmap;
        UserSession userSession2 = userSession;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        MJL mjl = new MJL(context2, userSession2, bitmap, str4, str5, str6, 1);
        0qQ.A0B(userSession2, 0);
        DbZ.A0t(1, str4, str5, str6);
        1vn A01 = 1vm.A01(userSession2);
        0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, str4, AnonymousClass000.A00(305));
        0Df.A00(A03, str5, C273654mx.A00(45));
        2IS A0D = JTQ.A0D(A03, str6, "full_collage_attachment_fbid");
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(A03, A0D, "input"), "IGDMediaCollageMutation", A0D.getParamsCopy(), C41845B3m.A04().getParamsCopy(), IGDMediaCollageMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xig_igd_send_media_collage", AnonymousClass7TE.A1C());
        AnonymousClass1EO ATL = A01.ATL(new C64394LbB(mjl, 14), C64403LbK.A00, pandoGraphQLRequest);
        if (bitmap2 != null) {
            bitmapDrawable = JTQ.A08(context2, bitmap2);
        } else {
            bitmapDrawable = null;
        }
        C310336ap A0W = DbV.A0W();
        A0W.A02 = context2.getResources().getDimensionPixelOffset(R.dimen.audio_page_audio_filter_tooltip_vertical_offset);
        DbS.A19(context2, A0W, 2131965699);
        A0W.A04 = bitmapDrawable;
        A0W.A03();
        A0W.A0K = false;
        DbW.A0q(context2, A0W, 2131965698);
        A0W.A0A(new KSH(ATL, 1));
        A0W.A0L = true;
        AnonymousClass2ZQ A002 = C71172bH.A00();
        if (!(A002 instanceof C249463jp) || (r1 = (C249463jp) A002) == null) {
            Dbb.A1Q(A0W);
        } else {
            r1.Bx5().A0A(A0W.A00());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0066, code lost:
        if (r0 == null) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.graphics.Bitmap r18, android.view.View r19, com.instagram.common.session.UserSession r20, com.instagram.model.direct.DirectThreadKey r21, java.lang.Integer r22) {
        /*
            r2 = 0
            r6 = r20
            X.0qQ.A0B(r6, r2)
            r16 = r18
            if (r18 == 0) goto L_0x007a
            r9 = 0
            java.lang.String r11 = X.2RR.A01()
            java.lang.String r1 = "direct_temp_photo"
            java.lang.String r0 = ".jpg"
            java.lang.String r12 = X.AnonymousClass45F.A04(r1, r0)
            r8 = r16
            r10 = r6
            r13 = r2
            r14 = r2
            X.8Cl r12 = X.C39908AIz.A03(r8, r9, r10, r11, r12, r13, r14)
            r17 = r19
            android.content.Context r5 = X.AnonymousClass7TE.A0S(r17)
            r8 = r21
            if (r21 == 0) goto L_0x007a
            X.797 r7 = X.AnonymousClass797.OPEN_ONLY
            com.instagram.pendingmedia.model.constants.ShareType r10 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            X.1ua r11 = X.JTO.A0n(r5, r6)
            r13 = r9
            r14 = r9
            r15 = r9
            X.5yB r0 = X.LTU.A02(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r5 = r0.A06
            com.instagram.pendingmedia.store.PendingMediaStore r21 = X.28K.A00(r6)
            com.instagram.pendingmedia.store.PendingMediaStoreSerializer r4 = X.28E.A00(r6)
            if (r22 == 0) goto L_0x0068
            int r3 = r22.intValue()
            X.A7x r0 = X.C395099zD.A00(r6)
            java.util.ArrayList r2 = r0.A01
            int r0 = r2.size()
            if (r0 > r3) goto L_0x0060
            r0 = 2368(0x940, float:3.318E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "Attempting to get index out of bounds layoutTypes"
            X.0wb.A03(r1, r0)
        L_0x0060:
            java.lang.Object r0 = X.00k.A0O(r2, r3)
            X.Nkp r0 = (X.C69410Nkp) r0
            if (r0 != 0) goto L_0x006a
        L_0x0068:
            X.Nkp r0 = X.C69410Nkp.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
        L_0x006a:
            X.MAB r15 = new X.MAB
            r18 = r6
            r20 = r8
            r22 = r5
            r19 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r4.A06(r15)
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64176LSd.A02(android.graphics.Bitmap, android.view.View, com.instagram.common.session.UserSession, com.instagram.model.direct.DirectThreadKey, java.lang.Integer):void");
    }
}
