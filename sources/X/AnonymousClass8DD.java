package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.google.common.collect.ImmutableList;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.camera.effect.mq.IgCameraEffectsController;
import com.instagram.camera.effect.mq.effectrendering.EffectRenderingService$applyEffect$1;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode;
import com.instagram.model.shopping.ProductAREffectContainer;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8DD  reason: invalid class name */
public final class AnonymousClass8DD implements AnonymousClass0iw, C273414mX, C312266e6, AnonymousClass8DE, C3493580b, AnonymousClass8DF, C3502283u, AnonymousClass84H {
    public static final String __redex_internal_original_name = "DialPickerController";
    public int A00;
    public AnonymousClass87G A01;
    public AnonymousClass87G A02;
    public C355948Rz A03;
    public C342517oj A04;
    public C352898Fm A05;
    public C17881VhY A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public Set A0A = new HashSet();
    public boolean A0B;
    public final Activity A0C;
    public final Handler A0D;
    public final View A0E;
    public final 2Fk A0F;
    public final 2cs A0G;
    public final C252203oj A0H;
    public final C3500082u A0I;
    public final C3502984c A0J;
    public final UserSession A0K;
    public final C357638Yz A0L;
    public final C3508086k A0M;
    public final C3504384q A0N;
    public final AnonymousClass8DM A0O;
    public final AnonymousClass8DH A0P;
    public final C3504884v A0Q;
    public final AnonymousClass80U A0R;
    public final C3495780x A0S;
    public final Runnable A0T;
    public final String A0U;
    public final HashSet A0V = new HashSet();
    public final boolean A0W;
    public final AnonymousClass86T A0X;
    public final AnonymousClass8DI A0Y;
    public final AnonymousClass86Y A0Z;

    private final void A01() {
        this.A04 = null;
        AnonymousClass8DM r2 = this.A0O;
        if (r2 != null) {
            AnonymousClass87G r0 = AnonymousClass87G.A0T;
            0qQ.A08(r0);
            r2.A8H(r0, 0);
            r2.EDb(1);
            r2.EUv((String) null);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.7oj, java.lang.Object] */
    public static final void A05(AnonymousClass8DD r10, AnonymousClass8YD r11, boolean z) {
        CameraAREffect A002;
        AnonymousClass8DD r5 = r10;
        C3504884v r4 = r10.A0Q;
        String str = null;
        if (!r4.A0H.CRm()) {
            C357638Yz r2 = r10.A0L;
            0kD.A07("ig_camera", 002.A0R("The current formats does not support AR effects, camerastate=", C393999xN.A00((C279284yO) r2.A08.A00, (Set) r2.A09.A00)), (Throwable) null);
            return;
        }
        AnonymousClass86T r1 = r10.A0X;
        String str2 = r11.A02;
        C278544x5 r0 = C278544x5.A06;
        C278544x5.A00(r0, true);
        if (r0.A02 || !00k.A0u(r1.A00, str2)) {
            AnonymousClass8DM r12 = r10.A0O;
            if (r12 != null) {
                int B0X = r12.B0X(str2);
                if (r12.CZO(B0X)) {
                    AnonymousClass87G B0Q = r12.B0Q(B0X);
                    if (B0Q == null) {
                        0wb.A03("DialElementConverter", "toAREffects() found null arEffect");
                        A002 = null;
                    } else {
                        A002 = B0Q.A00();
                    }
                    String A003 = r11.A00();
                    String str3 = r11.A03;
                    if (B0Q != null && B0Q.A04 == AnonymousClass87I.EMPTY) {
                        str = "empty_effect_selected";
                    }
                    r5.A02(A002, A003, str3, str, B0X, z);
                    r5.A0N.CLY();
                    return;
                }
                String str4 = r11.A03;
                ? obj = new Object();
                obj.A00 = str2;
                obj.A01 = str4;
                r5.A04 = obj;
                r5.A0N.A00();
                if (r4.A0g) {
                    A00(r5);
                }
                C318136oS A004 = C318116oQ.A00(r4);
                AnonymousClass9K3 r22 = new AnonymousClass9K3((Object) r4, (Object) r11, (AnonymousClass4D7) null, 34);
                1Eo.A03(AnonymousClass05K.A00, 19B.A00, r22, A004);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        Context context = r10.A0E.getContext();
        C59689JTv.A00(context, context.getResources().getString(2131976002), (String) null, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01c7, code lost:
        r7 = (X.AnonymousClass84D) r9.getValue();
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01d0, code lost:
        if ((r7 instanceof X.AnonymousClass8YD) == false) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d2, code lost:
        r7 = (X.AnonymousClass8YD) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01d4, code lost:
        if (r7 == null) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01d6, code lost:
        r6 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01d8, code lost:
        if (r0 == null) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01da, code lost:
        r5 = r0.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01e0, code lost:
        if (X.0qQ.A0K(r6, r5) == false) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01e2, code lost:
        r5 = r7.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01e8, code lost:
        if (r4.A04 != r2) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01ea, code lost:
        r7 = "empty_effect_selected";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01ec, code lost:
        A02(r0, r5, r13, r7, r12, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01f3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01f4, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01f6, code lost:
        r5 = "dial_select";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01f9, code lost:
        r14 = X.27p.A01(r8);
        r15 = X.C359198cG.A00(r7);
        r8 = r6.A0K;
        r7 = r6.A0M;
        r22 = r6.CbC();
        r21 = X.C371078xX.A00(r11);
        r14.A11(r15, X.AnonymousClass8YC.A00(r11), r8, r7, r6.A0I, r12, r21, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0220, code lost:
        if (r14 != r6) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        if ((r7 instanceof X.AnonymousClass80L) != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0187, code lost:
        if (r14 != X.AnonymousClass87I.AVATAR_PRESET) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0189, code lost:
        r6 = r4.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x018d, code lost:
        if (r6 != null) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x018f, code lost:
        X.0kD.A08("EffectTrayLogger", "logDialSelection() logs empty effect", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0197, code lost:
        r6 = r4.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0199, code lost:
        if (r6 == null) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x019b, code lost:
        r7 = r10.A0Q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x019d, code lost:
        if (r7 == null) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x019f, code lost:
        X.0qQ.A0A(r6);
        r8 = X.C14502TxO.A00(r6.A01);
        r7.A05 = X.C18386Vqm.A00(r8);
        r7.A0F.A03(r8);
        r7 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01b5, code lost:
        if (r7 == null) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01b7, code lost:
        X.0qQ.A0B(r8, 0);
        r6 = r7.A06;
        r6.add(r8.A0H);
        r7.A00 = r6.size();
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0183  */
    /* renamed from: A0F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DBj(X.AnonymousClass87G r25, java.lang.String r26, int r27, boolean r28) {
        /*
            r24 = this;
            r5 = 0
            r4 = r25
            X.0qQ.A0B(r4, r5)
            X.87I r1 = r4.A04
            X.87I r2 = X.AnonymousClass87I.EMPTY
            r0 = 0
            if (r1 != r2) goto L_0x000e
            r0 = 1
        L_0x000e:
            r1 = 1
            r3 = r24
            if (r0 == 0) goto L_0x001a
            X.8Fm r0 = r3.A05
            if (r0 == 0) goto L_0x001a
            r0.DjU(r1)
        L_0x001a:
            X.87I r0 = r4.A04
            X.87I r6 = X.AnonymousClass87I.AR_EFFECT
            if (r0 != r6) goto L_0x00eb
            X.80x r0 = r3.A0S
            X.7l2 r0 = r0.A01
            if (r0 == 0) goto L_0x0036
            X.7tb r0 = X.C340297l2.A02(r0)
            r7 = 0
            com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController r0 = (com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController) r0
            X.7lR r0 = r0.A04
            if (r0 == 0) goto L_0x0036
            X.7lX r0 = r0.A0N
            r0.EXp(r7, r5)
        L_0x0036:
            com.instagram.camera.effect.models.CameraAREffect r11 = r4.A00()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r10 = r0.toString()
            X.0qQ.A07(r10)
            X.8Yz r0 = r3.A0L
            X.80m r0 = r0.A08
            java.lang.Object r7 = r0.A00
            X.9QA r0 = X.AnonymousClass9QA.A00
            if (r7 == r0) goto L_0x0058
            boolean r0 = r7 instanceof X.AnonymousClass80O
            if (r0 != 0) goto L_0x0058
            boolean r7 = r7 instanceof X.AnonymousClass80L
            r0 = 0
            if (r7 == 0) goto L_0x0059
        L_0x0058:
            r0 = 1
        L_0x0059:
            r13 = r26
            r12 = r27
            r8 = r28
            if (r11 == 0) goto L_0x008e
            if (r0 == 0) goto L_0x008e
            X.84c r0 = r3.A0J
            if (r0 == 0) goto L_0x008e
            X.81C r0 = r0.A00
            X.81E r9 = r0.A00()
            X.8Za r9 = (X.C357648Za) r9
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            boolean r0 = r11.A0j
            if (r0 == 0) goto L_0x008e
            X.8Zb r0 = r9.A04
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x008e
            boolean r0 = r9.A05(r7, r10)
            if (r0 == 0) goto L_0x008e
            X.8DH r0 = r3.A0P
            if (r0 == 0) goto L_0x008d
            r0.A01 = r4
            r0.A00 = r12
            r0.A03 = r8
            r0.A02 = r13
        L_0x008d:
            return
        L_0x008e:
            X.8Fm r0 = r3.A05
            if (r0 == 0) goto L_0x0095
            r0.D8e(r4)
        L_0x0095:
            com.instagram.camera.effect.models.CameraAREffect r0 = r4.A00()
            com.instagram.model.shopping.ProductItemWithAR r7 = r4.A06
            if (r7 != 0) goto L_0x00b0
            X.84v r7 = r3.A0Q
            if (r0 == 0) goto L_0x00b0
            X.84s r7 = r7.A0C
            X.82X r7 = r7.A00
            com.instagram.camera.effect.mq.IgCameraEffectsController r7 = r7.A05
            com.instagram.camera.effect.models.CameraAREffect r7 = r7.A09
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x00b0
            return
        L_0x00b0:
            X.8DM r9 = r3.A0O
            if (r9 == 0) goto L_0x0230
            if (r0 != 0) goto L_0x00c4
            X.86k r7 = r3.A0M
            if (r7 == 0) goto L_0x00e7
            X.86n r7 = r7.A00()
            boolean r7 = r7.Ccf()
            if (r7 == 0) goto L_0x00e7
        L_0x00c4:
            r9.CLD()
        L_0x00c7:
            r9.Eu0()
            X.87I r9 = r4.A04
            X.87I r7 = X.AnonymousClass87I.DISCOVERY_SURFACE
            if (r9 != r7) goto L_0x010d
            java.lang.String r0 = "dial_element_selected"
            r3.A08(r0)
            if (r28 == 0) goto L_0x008d
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x008d
            r3.A0B = r1
            X.86Y r0 = r3.A0Z
            if (r0 == 0) goto L_0x00e4
            r0.A00(r1)
        L_0x00e4:
            r3.A0B = r5
            return
        L_0x00e7:
            r9.Eu0()
            goto L_0x00c7
        L_0x00eb:
            X.8Yz r0 = r3.A0L
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0036
            X.80x r0 = r3.A0S
            X.7l2 r0 = r0.A01
            if (r0 == 0) goto L_0x0036
            X.7tb r0 = X.C340297l2.A02(r0)
            r7 = 0
            com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController r0 = (com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController) r0
            X.7lR r0 = r0.A04
            if (r0 == 0) goto L_0x0036
            X.7lX r0 = r0.A0N
            r0.EXp(r7, r1)
            goto L_0x0036
        L_0x010d:
            X.87I r7 = X.AnonymousClass87I.LOADING_AR_EFFECT
            if (r9 == r7) goto L_0x0229
            if (r9 == r2) goto L_0x0125
            X.84v r7 = r3.A0Q
            if (r0 == 0) goto L_0x0224
            X.84s r7 = r7.A0C
            X.82X r7 = r7.A00
            com.instagram.camera.effect.mq.IgCameraEffectsController r7 = r7.A05
            com.instagram.camera.effect.models.CameraAREffect r7 = r7.A09
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x0224
        L_0x0125:
            X.84q r7 = r3.A0N
            r7.CLY()
        L_0x012a:
            if (r0 == 0) goto L_0x015f
            X.84v r8 = r3.A0Q
            java.lang.String r7 = r0.A0K
            X.0qQ.A07(r7)
            X.80x r9 = r8.A0P
            X.28D r9 = r9.A00
            java.lang.String r17 = X.C371068xW.A00(r9)
            X.84B r15 = X.AnonymousClass84B.EFFECT_TRAY
            r18 = 0
            r22 = -1
            X.8YD r14 = new X.8YD
            r19 = r18
            r20 = r18
            r21 = r18
            r23 = r5
            r16 = r7
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.848 r8 = r8.A05
            java.lang.String r7 = r14.A02
            boolean r7 = r8.A02(r7)
            if (r7 != 0) goto L_0x015f
            X.05G r7 = r8.A00
            r7.Epw(r14)
        L_0x015f:
            X.84v r10 = r3.A0Q
            com.instagram.common.session.UserSession r8 = r10.A0F
            X.8Yz r7 = r10.A0G
            X.80m r7 = r7.A08
            java.lang.Object r7 = r7.A00
            X.4yO r7 = (X.C279284yO) r7
            X.848 r9 = r10.A05
            X.05G r9 = r9.A00
            java.lang.Object r11 = r9.getValue()
            X.84D r11 = (X.AnonymousClass84D) r11
            X.84B r11 = r11.A00
            r14 = 3
            X.0qQ.A0B(r7, r14)
            r14 = 4
            X.0qQ.A0B(r11, r14)
            X.87I r14 = r4.A04
            if (r14 != 0) goto L_0x0220
            X.87I r14 = X.AnonymousClass87I.EMPTY
        L_0x0185:
            X.87I r6 = X.AnonymousClass87I.AVATAR_PRESET
            if (r14 != r6) goto L_0x0197
        L_0x0189:
            com.instagram.camera.effect.models.CameraAREffect r6 = r4.A00()
            if (r6 != 0) goto L_0x01f9
            r8 = 0
            java.lang.String r7 = "EffectTrayLogger"
            java.lang.String r6 = "logDialSelection() logs empty effect"
            X.0kD.A08(r7, r6, r8)
        L_0x0197:
            com.instagram.model.shopping.ProductItemWithAR r6 = r4.A06
            if (r6 == 0) goto L_0x01c7
            X.84u r7 = r10.A0Q
            if (r7 == 0) goto L_0x01c7
            X.0qQ.A0A(r6)
            com.instagram.user.model.ProductDetailsProductItemDict r6 = r6.A01
            com.instagram.user.model.Product r8 = X.C14502TxO.A00(r6)
            java.lang.String r6 = X.C18386Vqm.A00(r8)
            r7.A05 = r6
            X.Vvm r6 = r7.A0F
            r6.A03(r8)
            com.instagram.model.shopping.ShoppingCameraSurveyMetadata r7 = r7.A02
            if (r7 == 0) goto L_0x01c7
            X.0qQ.A0B(r8, r5)
            java.util.HashSet r6 = r7.A06
            java.lang.String r5 = r8.A0H
            r6.add(r5)
            int r5 = r6.size()
            r7.A00 = r5
        L_0x01c7:
            java.lang.Object r7 = r9.getValue()
            X.84D r7 = (X.AnonymousClass84D) r7
            boolean r6 = r7 instanceof X.AnonymousClass8YD
            r5 = 0
            if (r6 == 0) goto L_0x01f6
            X.8YD r7 = (X.AnonymousClass8YD) r7
            if (r7 == 0) goto L_0x01f6
            java.lang.String r6 = r7.A02
            if (r0 == 0) goto L_0x01dc
            java.lang.String r5 = r0.A0K
        L_0x01dc:
            boolean r5 = X.0qQ.A0K(r6, r5)
            if (r5 == 0) goto L_0x01f6
            java.lang.String r5 = r7.A00()
        L_0x01e6:
            X.87I r4 = r4.A04
            if (r4 != r2) goto L_0x01f4
            java.lang.String r7 = "empty_effect_selected"
        L_0x01ec:
            r4 = r0
            r6 = r13
            r8 = r12
            r9 = r1
            r3.A02(r4, r5, r6, r7, r8, r9)
            return
        L_0x01f4:
            r7 = 0
            goto L_0x01ec
        L_0x01f6:
            java.lang.String r5 = "dial_select"
            goto L_0x01e6
        L_0x01f9:
            X.27r r14 = X.27p.A01(r8)
            X.4yP r15 = X.C359198cG.A00(r7)
            java.lang.String r8 = r6.A0K
            java.lang.String r7 = r6.A0M
            boolean r22 = r6.CbC()
            int r21 = X.C371078xX.A00(r11)
            java.lang.String r6 = r6.A0I
            X.8xY r16 = X.AnonymousClass8YC.A00(r11)
            r17 = r8
            r18 = r7
            r19 = r6
            r20 = r12
            r14.A11(r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0197
        L_0x0220:
            if (r14 == r6) goto L_0x0189
            goto L_0x0185
        L_0x0224:
            java.lang.String r7 = "new_effect_selected"
            r3.A08(r7)
        L_0x0229:
            X.84q r7 = r3.A0N
            r7.A00()
            goto L_0x012a
        L_0x0230:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8DD.DBj(X.87G, java.lang.String, int, boolean):void");
    }

    public final void Cyf() {
    }

    /* JADX WARNING: type inference failed for: r0v30, types: [java.lang.Object, com.instagram.model.shopping.ProductAREffectContainer] */
    public final void DBh(AnonymousClass87G r10) {
        String str;
        EffectInfoBottomSheetMode effectInfoBottomSheetMode;
        ProductAREffectContainer productAREffectContainer;
        Product A042;
        User user;
        CameraAREffect A002 = r10.A00();
        if (r10.A04 == AnonymousClass87I.AR_EFFECT && A002 != null) {
            C3504884v r2 = this.A0Q;
            if (r2.A0H.Akh()) {
                C3504584s r1 = r2.A0C;
                boolean z = r2.A0g;
                C3504784u r4 = r2.A0Q;
                28D r3 = r2.A0P.A00;
                IgCameraEffectsController igCameraEffectsController = r1.A00.A05;
                if (!A002.equals(igCameraEffectsController.A09)) {
                    return;
                }
                if (A002.A0V == null) {
                    0wb.A03("CameraAREffect", 002.A0R("Cannot open bottom sheet with null primary actions, Effect ID: ", A002.A0K));
                    return;
                }
                if (r4 == null || (A042 = r4.A04()) == null || (user = A042.A0B) == null) {
                    str = A002.A0C;
                    if (str == null) {
                        0kD.A07("EffectInfoBottomSheetConfigurationProvider", 002.A0R("The attribution_username is null in the effect: ", A002.A0K), (Throwable) null);
                        return;
                    }
                } else {
                    str = user.getUsername();
                }
                C361848gv r22 = igCameraEffectsController.A07;
                EffectAttribution effectAttribution = null;
                if (r22 == null) {
                    0kD.A01("IgCameraEffectsController", "MQRenderer is null");
                } else if (r22.A0D() != null) {
                    effectAttribution = igCameraEffectsController.A07.A0D().mAttribution;
                }
                EffectInfoAttributionConfiguration effectInfoAttributionConfiguration = new EffectInfoAttributionConfiguration(A002, str);
                effectInfoAttributionConfiguration.A00 = effectAttribution;
                if (r4 != null) {
                    if (28D.A0U == r4.A00) {
                        effectInfoBottomSheetMode = EffectInfoBottomSheetMode.SHOPPING_TEST;
                    } else {
                        effectInfoBottomSheetMode = EffectInfoBottomSheetMode.SHOPPING;
                    }
                } else if (z) {
                    effectInfoBottomSheetMode = EffectInfoBottomSheetMode.TRY_ON;
                } else {
                    effectInfoBottomSheetMode = EffectInfoBottomSheetMode.NORMAL;
                }
                effectInfoAttributionConfiguration.A01 = effectInfoBottomSheetMode;
                if (r4 != null) {
                    ProductItemWithAR A012 = r4.A0F.A01(r4.A05);
                    0qQ.A0A(A012);
                    ProductArEffectMetadata productArEffectMetadata = A012.A00;
                    Product A032 = r4.A03();
                    0qQ.A0A(A032);
                    0qQ.A0B(A032, 0);
                    ProductItemWithAR productItemWithAR = new ProductItemWithAR(productArEffectMetadata, A032.A01);
                    boolean z2 = false;
                    if (r4.A04() != null) {
                        z2 = true;
                    }
                    boolean z3 = !z2;
                    ? obj = new Object();
                    obj.A00 = productItemWithAR;
                    obj.A01 = z3;
                    productAREffectContainer = obj;
                } else {
                    productAREffectContainer = null;
                }
                effectInfoAttributionConfiguration.A05 = productAREffectContainer;
                EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration = new EffectInfoBottomSheetConfiguration();
                effectInfoBottomSheetConfiguration.A02 = ImmutableList.of(effectInfoAttributionConfiguration);
                boolean z4 = false;
                effectInfoBottomSheetConfiguration.A00 = 0;
                effectInfoBottomSheetConfiguration.A01 = r3;
                if (z && r3 != 28D.A3v) {
                    z4 = true;
                }
                effectInfoBottomSheetConfiguration.A06 = z4;
                if (r4 != null) {
                    effectInfoBottomSheetConfiguration.A05 = !r4.A05();
                }
                UserSession userSession = this.A0K;
                Context context = this.A0C;
                if (context == null) {
                    context = this.A0E.getContext();
                }
                LPQ.A02(context, C59725JVj.PRE_CAPTURE, userSession, (C279284yO) this.A0L.A08.A00, effectInfoBottomSheetConfiguration, this, this);
            }
        }
    }

    public final void DHa(float f, float f2) {
        boolean z = false;
        if (f == 0.0f) {
            z = true;
        }
        this.A08 = !z;
    }

    public final void De5(String str) {
        0qQ.A0B(str, 0);
        A09(str);
    }

    public final void De6() {
    }

    public final void Dj6() {
    }

    public final void EDY(String str) {
        0qQ.A0B(str, 0);
        LPQ.A01(this.A0E.getContext());
        A09(str);
    }

    public static final int A00(AnonymousClass8DD r3) {
        int i = r3.A00 + (r3.A0Q.A0H.Bu9() ? 1 : 0);
        AnonymousClass8DM r1 = r3.A0O;
        if (r1 != null) {
            AnonymousClass87G r0 = AnonymousClass87G.A0U;
            0qQ.A08(r0);
            r1.A8H(r0, i);
            r1.notifyDataSetChanged();
            return i;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A02(CameraAREffect cameraAREffect, String str, String str2, String str3, int i, boolean z) {
        String str4;
        C371098xa r9;
        String str5;
        String str6;
        JSONObject jSONObject;
        String str7 = str3;
        AnonymousClass8DM r0 = this.A0O;
        if (r0 != null) {
            int i2 = i;
            r0.EKh(i2, z);
            r0.Crx(i2);
            C3504884v r2 = this.A0Q;
            C3504784u r5 = r2.A0Q;
            if (r5 == null || (jSONObject = (JSONObject) r5.A0J.get(r5.A05)) == null) {
                str4 = null;
            } else {
                try {
                    jSONObject.putOpt("selected_id", r5.A0K.get(r5.A05));
                } catch (JSONException unused) {
                    0wb.A03(C3504784u.__redex_internal_original_name, "Could not write DeepLink JSON");
                }
                str4 = jSONObject.toString();
            }
            CameraAREffect cameraAREffect2 = cameraAREffect;
            if (cameraAREffect != null) {
                C352898Fm r1 = this.A05;
                if (r1 != null) {
                    r1.DjU(false);
                }
                UserSession userSession = r2.A0F;
                String str8 = 27p.A01(userSession).A04.A0L;
                C3497681r r11 = r2.A08;
                C3494680m r12 = r2.A0G.A08;
                r11.Ewa(r2.A0P.A00, (C279284yO) r12.A00, cameraAREffect2, str8, str);
                if (cameraAREffect2.A0Q == null) {
                    C371088xY A002 = AnonymousClass8YC.A00(((AnonymousClass84D) r2.A05.A00.getValue()).A00);
                    if (A002 != null) {
                        str6 = A002.toString();
                    } else {
                        str6 = null;
                    }
                    cameraAREffect2.A0Q = str6;
                }
                if ("INSTAGRAM_CAMERA".equals(cameraAREffect2.A0E)) {
                    r9 = new C371098xa(r2);
                    02m r6 = r2.A0D;
                    r6.markerStart(660604063);
                    Object obj = r12.A00;
                    if (obj instanceof AnonymousClass9QA) {
                        str5 = "stories";
                    } else if (obj instanceof AnonymousClass80N) {
                        str5 = "clips";
                    } else if (obj instanceof AnonymousClass80L) {
                        str5 = "live";
                    } else {
                        str5 = r2.A0R;
                    }
                    r6.markerAnnotate(660604063, "surface", str5);
                } else {
                    r9 = null;
                }
                boolean A062 = 182.A06(0Tu.A05, userSession, 36324252114562985L);
                if (A062) {
                    C3504584s r02 = r2.A0C;
                    C3726391s r13 = new C3726391s(r2);
                    AnonymousClass82X r03 = r02.A00;
                    r03.A06(r13);
                    r03.A05.A0P.add(new C3726491t(r2));
                }
                AnonymousClass11O.A03(C318116oQ.A00(r2), new C61860pz(new AnonymousClass9K8(r2, (AnonymousClass4D7) null, A062), AnonymousClass0Zq.A00(new EffectRenderingService$applyEffect$1(cameraAREffect2, r2.A0C, r9, str4, str2, (AnonymousClass4D7) null))));
            } else {
                if (str3 == null) {
                    str7 = "dial_apply_null_effect";
                }
                A08(str7);
            }
            C352898Fm r14 = this.A05;
            if (r14 != null) {
                r14.Csu(r2.A0C.A00.A05.A09, cameraAREffect2);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A03(CameraConfiguration cameraConfiguration, AnonymousClass8DD r6) {
        boolean z;
        C279284yO r4 = cameraConfiguration.A03;
        Set set = cameraConfiguration.A04;
        Set set2 = r6.A0A;
        r6.A0A = Collections.unmodifiableSet(set);
        C358088aL r1 = C358088aL.A0C;
        if (set.contains(r1) || set2.contains(r1)) {
            r6.A0R.E3H(new Object());
        }
        C3508086k r12 = r6.A0M;
        if (r12 != null && r12.A00().CZ5() && !(r4 instanceof AnonymousClass80O)) {
            r12.A00().FKP(1.0f);
        }
        C358088aL r13 = C358088aL.A0K;
        if ((!set.contains(r13) || set2.contains(r13)) && (set.contains(r13) || !set2.contains(r13))) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            AnonymousClass8DM r0 = r6.A0O;
            if (r0 != null) {
                r0.notifyDataSetChanged();
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (r6.A0R.Ats() != AnonymousClass80X.POST_CAPTURE) {
            AnonymousClass8DM r02 = r6.A0O;
            if (r02 != null) {
                r02.Cuj(set);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final void A04(AnonymousClass8DD r15) {
        AnonymousClass87G r2 = r15.A02;
        if (r2 != null) {
            AnonymousClass8DM r4 = r15.A0O;
            if (r4 != null) {
                int Brp = r4.Brp();
                boolean EDa = r4.EDa(r2);
                r15.A0V.remove(r2);
                if (EDa) {
                    int i = r15.A00;
                    if (i > 0) {
                        r15.A00 = i - 1;
                    } else {
                        0kD.A07(__redex_internal_original_name, "Attempting to decrement saved count, but already zero", (Throwable) null);
                    }
                    r15.A02 = null;
                    r4.ELA((String) null, Brp, false);
                    AnonymousClass87G B0Q = r4.B0Q(Brp);
                    if (B0Q == null || B0Q.A04 != AnonymousClass87I.AR_EFFECT) {
                        r15.A0A("dial_apply_null_effect");
                        if (B0Q == null) {
                            return;
                        }
                    } else {
                        String id = B0Q.getId();
                        0qQ.A07(id);
                        A05(r15, new AnonymousClass8YD(AnonymousClass84B.EFFECT_TRAY, id, C371068xW.A00(r15.A0Q.A0P.A00), (String) null, (String) null, (String) null, (String) null, -1, false), true);
                    }
                    C352898Fm r0 = r15.A05;
                    if (r0 != null) {
                        r0.D8g(B0Q);
                        r4.EUv(B0Q.A0G);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final void A06(AnonymousClass8DD r5, boolean z) {
        AnonymousClass87G Aty;
        CameraAREffect A002;
        AnonymousClass8DM r4 = r5.A0O;
        if (r4 != null && (Aty = r4.Aty()) != null && (A002 = Aty.A00()) != null) {
            if (A002.CbC() == z) {
                0kD.A07(__redex_internal_original_name, "Attempting to save/unsave an effect that was already saved/unsaved", (Throwable) null);
            } else if (!r5.A0Q.A0H.Buj()) {
            } else {
                if (z) {
                    AnonymousClass87G Bre = r4.Bre();
                    if (Bre != null && Bre.A00() != null) {
                        HashSet hashSet = r5.A0V;
                        if (!hashSet.contains(Bre)) {
                            int Brp = r4.Brp() + 1;
                            hashSet.add(Bre);
                            r4.A8H(Bre, r5.A00);
                            r5.A00++;
                            r4.notifyDataSetChanged();
                            r4.ELA((String) null, Brp, false);
                        }
                    }
                } else if (r4.Brp() <= r5.A00) {
                    r5.A02 = Aty;
                } else {
                    HashSet hashSet2 = r5.A0V;
                    if (hashSet2.contains(Aty)) {
                        int Brp2 = r4.Brp() - 1;
                        boolean EDa = r4.EDa(Aty);
                        hashSet2.remove(Aty);
                        r4.notifyDataSetChanged();
                        if (EDa) {
                            int i = r5.A00;
                            if (i > 0) {
                                r5.A00 = i - 1;
                            } else {
                                0kD.A07(__redex_internal_original_name, "Attempting to decrement saved count, but already zero", (Throwable) null);
                            }
                            r4.ELA((String) null, Brp2, false);
                            AnonymousClass87G B0Q = r4.B0Q(Brp2);
                            if (B0Q != null && B0Q.A04 == AnonymousClass87I.DISCOVERY_SURFACE) {
                                r5.A08("dial_element_selected");
                                C352898Fm r0 = r5.A05;
                                if (r0 != null) {
                                    r0.D8g(B0Q);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private final void A07(Object obj) {
        AnonymousClass8DM r0 = this.A0O;
        if (r0 != null) {
            r0.DDM();
            if (!(obj instanceof AnonymousClass8SJ)) {
                A0B(true);
                this.A0G.A06(0.0d);
            } else {
                A0B(false);
                2cs r1 = this.A0G;
                r1.A08(0.0d, true);
                this.A0H.DmC(r1);
            }
            if (((obj instanceof AnonymousClass8SF) && this.A0Q.A0H.B0F() != C358348al.LIVE) || (obj instanceof AnonymousClass8SD)) {
                this.A0N.CLY();
                A0A("exit_dial_picker_state");
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A08(String str) {
        C312596el r1;
        String str2;
        this.A0I.A00.A00(new AnonymousClass9JG(__redex_internal_original_name, "clearCurrentEffect"));
        this.A04 = null;
        C3504884v r8 = this.A0Q;
        AnonymousClass82X r10 = r8.A0C.A00;
        IgCameraEffectsController igCameraEffectsController = r10.A05;
        CameraAREffect cameraAREffect = igCameraEffectsController.A09;
        if (cameraAREffect != null && "INSTAGRAM_CAMERA".equals(cameraAREffect.A0E)) {
            r8.A0W.Epw(false);
            r8.A0D.markerEnd(660604063, 4);
        }
        boolean z = true;
        if (909729002 == str.hashCode() && str.equals("new_effect_selected")) {
            z = false;
        }
        CameraAREffect cameraAREffect2 = igCameraEffectsController.A09;
        if (!(cameraAREffect2 == null || (str2 = cameraAREffect2.A0K) == null)) {
            r10.A03.FMm(str2, str);
        }
        CameraAREffect cameraAREffect3 = igCameraEffectsController.A09;
        C312196dz r2 = igCameraEffectsController.A0L;
        if (!(r2 == null || cameraAREffect3 == null)) {
            r2.EyC(cameraAREffect3.A0K);
        }
        CameraAREffect cameraAREffect4 = igCameraEffectsController.A09;
        for (AnonymousClass82E DBe : igCameraEffectsController.A0R) {
            DBe.DBe((CameraAREffect) null, cameraAREffect4);
        }
        igCameraEffectsController.A09 = null;
        igCameraEffectsController.A0A = null;
        Map map = igCameraEffectsController.A0H.A00;
        map.clear();
        map.putAll(0Yt.A0E());
        if (z) {
            r1 = C312596el.USER_INTERACTION;
        } else {
            r1 = C312596el.SYSTEM;
        }
        IgCameraEffectsController.A01(r1, igCameraEffectsController, "clearCurrentEffect", true, false);
        boolean equals = str.equals("new_effect_selected");
        if (!equals) {
            AnonymousClass848 r3 = r8.A05;
            if (r3.A00.getValue() instanceof AnonymousClass8YD) {
                r8.A0B.A05.Epw(C3504984y.A00);
                r3.A01(AnonymousClass84B.EFFECT_TRAY);
            }
        }
        C352898Fm r12 = this.A05;
        if (r12 != null) {
            r12.DjU(true);
            if (!equals) {
                r12.Csu(cameraAREffect, (CameraAREffect) null);
            }
        }
    }

    private final void A09(String str) {
        AnonymousClass8DM r2 = this.A0O;
        if (r2 != null) {
            if (r2.B0a() == 1) {
                A01();
            } else {
                int B0X = r2.B0X(str);
                if (r2.EDb(B0X)) {
                    if (B0X >= r2.B0a()) {
                        B0X--;
                    }
                    if (!r2.CZO(B0X)) {
                        String format = String.format(Locale.US, "removeEffect() invalid newIndex=%d size =%d", Arrays.copyOf(new Object[]{Integer.valueOf(B0X), Integer.valueOf(r2.B0a())}, 2));
                        0qQ.A07(format);
                        0kD.A07(__redex_internal_original_name, format, (Throwable) null);
                    }
                    AnonymousClass87G B0Q = r2.B0Q(B0X);
                    if (B0Q != null && B0Q.A04 == AnonymousClass87I.AR_EFFECT) {
                        String id = B0Q.getId();
                        0qQ.A07(id);
                        A05(this, new AnonymousClass8YD(AnonymousClass84B.EFFECT_TRAY, id, C371068xW.A00(this.A0Q.A0P.A00), (String) null, (String) null, (String) null, (String) null, -1, false), true);
                        r2.EUv(B0Q.A0G);
                        C352898Fm r0 = this.A05;
                        if (r0 != null) {
                            r0.D8g(B0Q);
                        }
                    }
                }
            }
            C3504884v r4 = this.A0Q;
            CameraAREffect cameraAREffect = r4.A0C.A00.A05.A09;
            if (cameraAREffect != null && 0qQ.A0K(cameraAREffect.A0K, str)) {
                A08("remove_effect_user_request");
            }
            1Eo.A05(19B.A00, new MGE(r4, str, (AnonymousClass4D7) null, 38), C318116oQ.A00(r4));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A0A(String str) {
        if (this.A0Q.A0H.BuC()) {
            A01();
        } else {
            AnonymousClass8DM r0 = this.A0O;
            if (r0 != null) {
                r0.EEa();
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        A08(str);
    }

    private final void A0B(boolean z) {
        AnonymousClass8DM r0 = this.A0O;
        if (r0 != null) {
            r0.EOe(z);
            this.A07 = z;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final boolean A0C(AnonymousClass8DD r2) {
        C357638Yz r22 = r2.A0L;
        if (r22.A0V(C358088aL.A0C) || (r22.A08.A00 instanceof AnonymousClass80K)) {
            return false;
        }
        return true;
    }

    public final AnonymousClass87G A0D() {
        AnonymousClass8DM r0 = this.A0O;
        if (r0 != null) {
            return r0.Aty();
        }
        return null;
    }

    public final void A0E() {
        this.A0D.removeCallbacks(this.A0T);
        AnonymousClass8DM r0 = this.A0O;
        if (r0 != null) {
            if (!r0.isEmpty() && A0C(this)) {
                A0A("camera_enter_hidden");
            }
            this.A0Y.A02.A00.clear();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A0G(String str) {
        AnonymousClass8DM r2 = this.A0O;
        if (r2 != null) {
            r2.Cmz();
            String str2 = str;
            if (str != null) {
                AnonymousClass8YD r3 = new AnonymousClass8YD(AnonymousClass84B.EFFECT_TRAY, str2, "live_camera", (String) null, (String) null, (String) null, (String) null, -1, false);
                AnonymousClass848 r1 = this.A0Q.A05;
                if (!r1.A02(r3.A02)) {
                    r1.A00.Epw(r3);
                }
                r2.EL8(str);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A0H(boolean z) {
        AnonymousClass87G r0;
        boolean z2;
        AnonymousClass87I r1;
        AnonymousClass8DM r3 = this.A0O;
        if (r3 != null) {
            r0 = r3.BaM();
        } else {
            r0 = null;
        }
        if (r0 == null || !((r1 = r0.A04) == AnonymousClass87I.EMPTY || r1 == AnonymousClass87I.DISCOVERY_SURFACE)) {
            z2 = true;
            if (this.A0Q.A0H.BuC()) {
                A01();
                return;
            }
        } else {
            z2 = false;
        }
        if (A0C(this) && z2 && r3 != null) {
            AnonymousClass87G r02 = AnonymousClass87G.A0T;
            0qQ.A08(r02);
            r3.EKh(Math.max(r3.B0W(r02), 0), z);
        }
    }

    public final /* bridge */ /* synthetic */ boolean A76(Object obj, Object obj2) {
        if (obj == AnonymousClass80V.PRE_CAPTURE_AR_EFFECT_TRAY) {
            return A0C(this);
        }
        throw new UnsupportedOperationException("Unexpected filtered state");
    }

    public final void AVf(AnonymousClass87G r2, Map map) {
        C352898Fm r0 = this.A05;
        if (r0 != null) {
            r0.D8c(r2, map);
        }
    }

    public final int BMI() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ void DMF(AnonymousClass518 r2, int i) {
        AnonymousClass87G r22 = (AnonymousClass87G) r2;
        0qQ.A0B(r22, 0);
        C352898Fm r0 = this.A05;
        if (r0 != null) {
            r0.D8g(r22);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        if (r7 == X.AnonymousClass80V.CONFIGURE_CAMERA) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void Dmx(java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            r6 = this;
            X.80V r7 = (X.AnonymousClass80V) r7
            X.80V r8 = (X.AnonymousClass80V) r8
            r0 = 0
            X.0qQ.A0B(r7, r0)
            r0 = 1
            r2 = 3
            X.0qQ.A0B(r8, r0)
            r0 = 2
            r1 = 10
            X.0qQ.A0B(r9, r0)
            int r0 = r7.ordinal()
            if (r0 == r2) goto L_0x00de
            if (r0 != r1) goto L_0x0036
            boolean r0 = r9 instanceof X.C355968Sb
            if (r0 == 0) goto L_0x0036
            boolean r0 = r6.A07
            if (r0 != 0) goto L_0x0036
            X.8Rz r0 = r6.A03
            if (r0 == 0) goto L_0x0032
            r1 = 0
            X.81m r0 = r0.A0K
            X.81t r0 = r0.A00()
            float r1 = r1 * r1
            r0.FMC(r1)
        L_0x0032:
            r0 = 1
            r6.A0B(r0)
        L_0x0036:
            int r0 = r8.ordinal()
            switch(r0) {
                case 0: goto L_0x00ec;
                case 2: goto L_0x003e;
                case 3: goto L_0x0087;
                case 47: goto L_0x0087;
                case 48: goto L_0x00e9;
                case 50: goto L_0x0087;
                case 51: goto L_0x00d4;
                case 52: goto L_0x00e9;
                default: goto L_0x003d;
            }
        L_0x003d:
            return
        L_0x003e:
            X.8DM r2 = r6.A0O
            if (r2 == 0) goto L_0x00f0
            X.87G r3 = r2.Bre()
            X.84v r4 = r6.A0Q
            X.856 r0 = r4.A0H
            X.8al r1 = r0.B0F()
            boolean r0 = A0C(r6)
            if (r0 == 0) goto L_0x0076
            X.8al r0 = X.C358348al.LIVE
            if (r1 != r0) goto L_0x005d
            X.80V r0 = X.AnonymousClass80V.CONFIGURE_CAMERA
            r1 = 0
            if (r7 != r0) goto L_0x0084
        L_0x005d:
            r1 = 1
            X.05G r0 = r4.A0e
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0084
            X.80U r1 = r6.A0R
            X.8SF r0 = new X.8SF
            r0.<init>()
            r1.E3H(r0)
        L_0x0076:
            if (r3 == 0) goto L_0x003d
            boolean r0 = A0C(r6)
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = r3.A0G
            r2.EUv(r0)
            return
        L_0x0084:
            r6.A09 = r1
            goto L_0x0076
        L_0x0087:
            boolean r0 = r6.A0W
            if (r0 == 0) goto L_0x009f
            android.view.View r0 = r6.A0E
            android.content.Context r0 = r0.getContext()
            android.content.Context r0 = r0.getApplicationContext()
            X.0qQ.A07(r0)
            boolean r0 = X.AnonymousClass8FD.A00(r0)
            if (r0 != 0) goto L_0x009f
            return
        L_0x009f:
            X.8DM r2 = r6.A0O
            if (r2 == 0) goto L_0x00f8
            r2.DCI()
            boolean r0 = r9 instanceof X.AnonymousClass8SG
            r1 = r0 ^ 1
            r0 = 0
            r2.setVisibility(r0)
            r5 = 1
            r6.A0B(r5)
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            X.2cs r2 = r6.A0G
            if (r1 == 0) goto L_0x00d0
            r0 = 0
            r2.A08(r0, r5)
            r2.A06(r3)
        L_0x00c0:
            X.86k r0 = r6.A0M
            if (r0 == 0) goto L_0x003d
            X.86n r1 = r0.A00()
            if (r1 == 0) goto L_0x003d
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.FLb(r0)
            return
        L_0x00d0:
            r2.A08(r3, r5)
            goto L_0x00c0
        L_0x00d4:
            boolean r0 = A0C(r6)
            if (r0 == 0) goto L_0x003d
            r6.A07(r9)
            return
        L_0x00de:
            boolean r0 = A0C(r6)
            if (r0 == 0) goto L_0x0036
            r6.A07(r9)
            goto L_0x0036
        L_0x00e9:
            r6.A07(r9)
        L_0x00ec:
            r6.A0E()
            return
        L_0x00f0:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00f8:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8DD.Dmx(java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    public final String getModuleName() {
        return this.A0U;
    }

    public final void Cyc() {
        A04(this);
    }

    public final void DBd(boolean z, String str) {
        C3508286n A002;
        A06(this, z);
        C3508086k r0 = this.A0M;
        if (r0 != null && (A002 = r0.A00()) != null) {
            A002.EBD();
        }
    }

    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r0v95, types: [X.8DJ, X.0sa] */
    /* JADX WARNING: type inference failed for: r16v2, types: [X.8DL] */
    /* JADX WARNING: type inference failed for: r16v3, types: [X.Ozv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8DD(android.app.Activity r29, android.view.View r30, X.AnonymousClass07Z r31, X.2Fk r32, X.2cp r33, X.C3500082u r34, X.C3502984c r35, com.instagram.common.session.UserSession r36, X.C357638Yz r37, X.C3508086k r38, X.C3504384q r39, X.AnonymousClass86Y r40, X.C3504884v r41, X.AnonymousClass86A r42, X.AnonymousClass80U r43, X.C3495780x r44, java.lang.String r45, boolean r46) {
        /*
            r28 = this;
            r3 = r43
            r12 = 1
            X.0qQ.A0B(r3, r12)
            r0 = 2
            r14 = r37
            X.0qQ.A0B(r14, r0)
            r0 = 3
            r13 = r32
            X.0qQ.A0B(r13, r0)
            r0 = 6
            r9 = r36
            X.0qQ.A0B(r9, r0)
            r0 = 10
            r8 = r41
            X.0qQ.A0B(r8, r0)
            r0 = 12
            r2 = r45
            X.0qQ.A0B(r2, r0)
            r0 = 13
            r4 = r44
            X.0qQ.A0B(r4, r0)
            r7 = 17
            r10 = r31
            X.0qQ.A0B(r10, r7)
            r11 = r28
            r11.<init>()
            r11.A0R = r3
            r11.A0L = r14
            r11.A0F = r13
            r27 = r30
            r0 = r27
            r11.A0E = r0
            r0 = r39
            r11.A0N = r0
            r11.A0K = r9
            r0 = r40
            r11.A0Z = r0
            r1 = r38
            r11.A0M = r1
            r0 = r29
            r11.A0C = r0
            r11.A0Q = r8
            r0 = r46
            r11.A0W = r0
            r11.A0U = r2
            r11.A0S = r4
            r4 = r35
            r11.A0J = r4
            r15 = r34
            r11.A0I = r15
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r11.A0A = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r11.A0V = r0
            r3.A7w(r11)
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r2)
            r11.A0D = r0
            if (r35 != 0) goto L_0x0361
            r0 = 0
        L_0x0088:
            r11.A0P = r0
            X.8DI r6 = new X.8DI
            r0 = r42
            r6.<init>(r9, r11, r0)
            r11.A0Y = r6
            X.80T r3 = (X.AnonymousClass80T) r3
            X.80W r5 = r3.A01
            r4 = 0
            java.lang.String r3 = r8.A0R
            if (r38 == 0) goto L_0x035e
            X.8DJ r0 = new X.8DJ
            r0.<init>(r1)
            X.8DK r2 = new X.8DK
            r2.<init>(r0)
        L_0x00a6:
            r25 = 0
            r1 = 2
            X.0qQ.A0B(r5, r1)
            java.lang.String r0 = "pre_capture"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x033e
            java.lang.String r0 = "rtc_camera_together"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x033e
            X.Ozv r0 = new X.Ozv
            r21 = r11
            r26 = r25
            r22 = r4
            r23 = r5
            r24 = r3
            r19 = r9
            r20 = r6
            r17 = r27
            r18 = r11
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x00d5:
            X.8DM r0 = (X.AnonymousClass8DM) r0
            r11.A0O = r0
            r6.A00 = r0
            r11.A0B(r12)
            X.2cs r3 = r33.A02()
            r3.A06 = r12
            r11.A0G = r3
            X.3oj r2 = r0.BoF()
            r11.A0H = r2
            r3.A0A(r2)
            X.86T r2 = new X.86T
            r2.<init>()
            r11.A0X = r2
            X.8DW r2 = new X.8DW
            r2.<init>(r0, r11)
            r11.A0T = r2
            android.content.Context r0 = r27.getContext()
            X.0qQ.A07(r0)
            boolean r0 = X.C305756Jk.A00(r0)
            if (r0 == 0) goto L_0x0214
            X.8Yz r6 = r8.A0G
            r3 = 44
            r2 = 42
            X.MGz r0 = new X.MGz
            r0.<init>((java.lang.Object) r6, (X.AnonymousClass4D7) r4, (int) r3, (int) r2)
            X.032 r0 = X.AnonymousClass0Zq.A00(r0)
            X.0r6 r3 = X.AnonymousClass11E.A01(r0)
            r2 = 19
            X.9Jz r0 = new X.9Jz
            r0.<init>(r8, r4, r2)
            X.0pz r2 = new X.0pz
            r2.<init>(r0, r3)
            X.9KD r0 = new X.9KD
            r0.<init>((java.lang.Object) r8, (X.AnonymousClass4D7) r4, (int) r1)
            X.02x r3 = X.10q.A02(r0, r2)
            X.856 r0 = r8.A0H
            X.0r6 r2 = r0.ARB(r5)
            X.848 r6 = r8.A05
            X.05G r1 = r6.A01
            X.8Da r0 = new X.8Da
            r0.<init>(r8, r1)
            X.8Db r1 = new X.8Db
            r1.<init>(r0)
            X.8Dc r0 = new X.8Dc
            r0.<init>(r8, r1)
            X.8Dd r1 = new X.8Dd
            r1.<init>(r8, r0)
            X.05G r0 = r6.A00
            X.8De r6 = new X.8De
            r6.<init>(r0)
            X.8Df r0 = new X.8Df
            r0.<init>(r6)
            X.0r6 r0 = X.AnonymousClass11E.A01(r0)
            X.0r6[] r0 = new X.AnonymousClass0r6[]{r2, r1, r0}
            X.055 r0 = X.10q.A04(r0)
            X.8Dg r1 = new X.8Dg
            r1.<init>(r8, r0)
            X.8Dh r0 = new X.8Dh
            r0.<init>(r8, r1)
            X.0r6 r6 = X.AnonymousClass11E.A01(r0)
            X.3ju r0 = r8.A0V
            X.05Y r1 = X.0u9.A04(r0)
            X.8Di r0 = new X.8Di
            r0.<init>(r8, r1)
            X.8Dj r2 = new X.8Dj
            r2.<init>(r8, r0)
            X.05G r1 = r8.A0X
            X.8Dk r0 = new X.8Dk
            r0.<init>(r8, r1)
            X.0r6[] r0 = new X.AnonymousClass0r6[]{r6, r2, r0}
            X.055 r2 = X.10q.A04(r0)
            r1 = 4
            X.9KD r0 = new X.9KD
            r0.<init>((java.lang.Object) r8, (X.AnonymousClass4D7) r4, (int) r1)
            X.02x r0 = X.10q.A02(r0, r2)
            X.0r6[] r0 = new X.AnonymousClass0r6[]{r3, r0}
            X.055 r1 = X.10q.A04(r0)
            X.05G r0 = r8.A0e
            com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$getTray$3 r2 = new com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$getTray$3
            r2.<init>(r4)
            X.0r6[] r1 = new X.AnonymousClass0r6[]{r1, r0}
            X.0Vk r0 = new X.0Vk
            r0.<init>(r4, r2, r1)
            X.05E r1 = new X.05E
            r1.<init>(r0)
            X.8Dm r0 = new X.8Dm
            r0.<init>(r8, r1)
            X.0r6 r2 = X.AnonymousClass11E.A01(r0)
            X.0r6 r0 = X.AnonymousClass8DX.A00(r5)
            X.8Dn r5 = new X.8Dn
            r5.<init>(r0)
            X.6oS r3 = X.C318116oQ.A00(r8)
            X.109 r1 = X.AnonymousClass10A.A01
            X.80V r0 = X.AnonymousClass80V.HIDDEN
            X.05F r1 = X.10b.A02(r0, r3, r5, r1)
            X.9KD r0 = new X.9KD
            r0.<init>((X.AnonymousClass4D7) r4, (java.lang.Object) r2, (int) r12)
            X.02x r2 = X.10q.A02(r0, r1)
            r1 = 20
            X.9Jz r0 = new X.9Jz
            r0.<init>(r8, r4, r1)
            X.0pz r1 = new X.0pz
            r1.<init>(r0, r2)
            X.19B r0 = X.19B.A00
            androidx.lifecycle.CoroutineLiveData r1 = X.C226292g8.A00(r0, r1)
            X.2gB r2 = new X.2gB
            r2.<init>()
            X.8Do r0 = new X.8Do
            r0.<init>(r1, r2, r11)
            r2.A0E(r13, r0)
            r2.A0E(r1, r0)
            r0 = 34
            X.9LG r1 = new X.9LG
            r1.<init>(r11, r0)
            X.8Dp r0 = new X.8Dp
            r0.<init>(r1)
            r2.A06(r10, r0)
        L_0x0214:
            X.85G r2 = r8.A0K
            r0 = 35
            X.9LG r1 = new X.9LG
            r1.<init>(r11, r0)
            X.8Dp r0 = new X.8Dp
            r0.<init>(r1)
            r2.A06(r10, r0)
            X.85G r2 = r8.A0L
            r0 = 36
            X.9LG r1 = new X.9LG
            r1.<init>(r11, r0)
            X.8Dp r0 = new X.8Dp
            r0.<init>(r1)
            r2.A06(r10, r0)
            X.2Fk r2 = r8.A02
            r0 = 37
            X.9LG r1 = new X.9LG
            r1.<init>(r11, r0)
            X.8Dp r0 = new X.8Dp
            r0.<init>(r1)
            r2.A06(r10, r0)
            X.85G r2 = r8.A0J
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Unit>"
            X.0qQ.A0C(r2, r0)
            r0 = 38
            X.9LG r1 = new X.9LG
            r1.<init>(r11, r0)
            X.8Dp r0 = new X.8Dp
            r0.<init>(r1)
            r2.A06(r10, r0)
            X.85G r2 = r8.A0N
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Int>"
            X.0qQ.A0C(r2, r0)
            r0 = 39
            X.9LG r1 = new X.9LG
            r1.<init>(r11, r0)
            X.8Dp r0 = new X.8Dp
            r0.<init>(r1)
            r2.A06(r10, r0)
            X.85G r2 = r8.A0M
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.String>"
            X.0qQ.A0C(r2, r0)
            r0 = 40
            X.9LG r1 = new X.9LG
            r1.<init>(r11, r0)
            X.8Dp r0 = new X.8Dp
            r0.<init>(r1)
            r2.A06(r10, r0)
            X.848 r0 = r8.A05
            X.05G r2 = r0.A00
            r1 = 21
            X.9Jz r0 = new X.9Jz
            r0.<init>(r8, r4, r1)
            X.0pz r1 = new X.0pz
            r1.<init>(r0, r2)
            X.8Dr r0 = new X.8Dr
            r0.<init>(r1)
            X.19B r3 = X.19B.A00
            androidx.lifecycle.CoroutineLiveData r2 = X.C226292g8.A00(r3, r0)
            r0 = 41
            X.9LG r1 = new X.9LG
            r1.<init>(r11, r0)
            X.8Dp r0 = new X.8Dp
            r0.<init>(r1)
            r2.A06(r10, r0)
            X.0Tu r2 = X.0Tu.A06
            r0 = 36327627958598215(0x810fc900013a47, double:3.037076428409526E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x02c8
            X.AYR r0 = new X.AYR
            r0.<init>(r11)
            r14.A0E(r0)
        L_0x02c8:
            X.05G r0 = r8.A0e
            androidx.lifecycle.CoroutineLiveData r2 = X.C226292g8.A00(r3, r0)
            r0 = 30
            X.9LG r1 = new X.9LG
            r1.<init>(r11, r0)
            X.8Dp r0 = new X.8Dp
            r0.<init>(r1)
            r2.A06(r10, r0)
            X.2gB r2 = r8.A01()
            r0 = 31
            X.9LG r1 = new X.9LG
            r1.<init>(r11, r0)
            X.8Dp r0 = new X.8Dp
            r0.<init>(r1)
            r2.A06(r10, r0)
            X.05G r0 = r8.A0c
            androidx.lifecycle.CoroutineLiveData r2 = X.C226292g8.A00(r3, r0)
            r0 = 32
            X.9LG r1 = new X.9LG
            r1.<init>(r11, r0)
            X.8Dp r0 = new X.8Dp
            r0.<init>(r1)
            r2.A06(r10, r0)
            X.84s r2 = r8.A0C
            r1 = 22
            X.9K3 r0 = new X.9K3
            r0.<init>(r2, r4, r1)
            X.032 r2 = X.AnonymousClass0Zq.A00(r0)
            X.9Jz r1 = new X.9Jz
            r1.<init>(r8, r4, r7)
            X.0pz r0 = new X.0pz
            r0.<init>(r1, r2)
            androidx.lifecycle.CoroutineLiveData r2 = X.C226292g8.A00(r3, r0)
            r0 = 33
            X.9LG r1 = new X.9LG
            r1.<init>(r11, r0)
            X.8Dp r0 = new X.8Dp
            r0.<init>(r1)
            r2.A06(r10, r0)
            java.lang.String r3 = "DialPickerController"
            X.29F r2 = r15.A00
            java.lang.String r1 = "dialPickerInitialized"
            X.9JG r0 = new X.9JG
            r0.<init>(r3, r1)
            r2.A00(r0)
            return
        L_0x033e:
            android.content.Context r17 = r27.getContext()
            X.0qQ.A07(r17)
            if (r2 == 0) goto L_0x0368
            X.8DL r0 = new X.8DL
            r16 = r0
            r18 = r11
            r19 = r9
            r20 = r14
            r21 = r6
            r22 = r11
            r23 = r3
            r24 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x00d5
        L_0x035e:
            r2 = 0
            goto L_0x00a6
        L_0x0361:
            X.8DH r0 = new X.8DH
            r0.<init>(r11)
            goto L_0x0088
        L_0x0368:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8DD.<init>(android.app.Activity, android.view.View, X.07Z, X.2Fk, X.2cp, X.82u, X.84c, com.instagram.common.session.UserSession, X.8Yz, X.86k, X.84q, X.86Y, X.84v, X.86A, X.80U, X.80x, java.lang.String, boolean):void");
    }
}
