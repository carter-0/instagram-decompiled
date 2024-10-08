package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode;
import java.util.HashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.8oa  reason: invalid class name and case insensitive filesystem */
public final class C366258oa {
    public boolean A00;
    public final ViewGroup A01;
    public final 2cs A02;
    public final UserSession A03;
    public final C3504384q A04;
    public final AnonymousClass8DM A05;
    public final AnonymousClass8DI A06;
    public final C366068o8 A07;
    public final AnonymousClass80U A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass4DH A0B;

    public C366258oa(View view, AnonymousClass07Z r20, AnonymousClass4DH r21, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C3504384q r24, C366068o8 r25, AnonymousClass80U r26) {
        AnonymousClass80U r1 = r26;
        0qQ.A0B(r1, 4);
        C3504384q r0 = r24;
        0qQ.A0B(r0, 5);
        C366068o8 r5 = r25;
        this.A07 = r5;
        UserSession userSession2 = userSession;
        this.A03 = userSession2;
        this.A08 = r1;
        this.A04 = r0;
        AnonymousClass4DH r11 = r21;
        this.A0B = r11;
        View view2 = view;
        View requireViewById = view2.requireViewById(R.id.post_capture_effects_container);
        0qQ.A07(requireViewById);
        ViewGroup viewGroup = (ViewGroup) requireViewById;
        this.A01 = viewGroup;
        AnonymousClass8DI r14 = new AnonymousClass8DI(userSession2, new C366268ob(this), new AnonymousClass86A((HashSet) null, (DefaultConstructorMarker) null, 1));
        this.A06 = r14;
        0eO r9 = 0eO.A02;
        this.A09 = AnonymousClass0eN.A00(r9, new AnonymousClass9LC(this, 22));
        this.A0A = AnonymousClass0eN.A00(r9, new AnonymousClass9MH(15, (Object) view2, (Object) this, (Object) targetViewSizeProvider));
        Context context = view2.getContext();
        LayoutInflater.from(context).inflate(R.layout.layout_post_capture_effects_stub, viewGroup, true);
        C366278oc r15 = new C366278oc(this);
        C366308of r12 = (C366308of) this.A0A.getValue();
        0qQ.A0B(r12, 5);
        0qQ.A07(context);
        AnonymousClass8DL r92 = new AnonymousClass8DL(context, r11, userSession2, (C357638Yz) null, r14, r15, "post_capture", new C366328oh(r12));
        this.A05 = r92;
        2cs A022 = C61340me.A00().A02();
        A022.A06 = true;
        A022.A0A(r92.BoF());
        this.A02 = A022;
        r14.A00 = r92;
        AnonymousClass0Ud r02 = r5.A04;
        if (r02 == null) {
            0qQ.A0F("effectTrayState");
            throw AnonymousClass00P.createAndThrow();
        }
        19B r7 = 19B.A00;
        AnonymousClass07Z r6 = r20;
        C226292g8.A00(r7, r02).A06(r6, new C366348ok(new AnonymousClass9LG(this, 42)));
        C226292g8.A00(r7, new C366368on(r5.A0G.A00)).A06(r6, new C366348ok(new AnonymousClass9LG(this, 43)));
        AnonymousClass11O.A03(AnonymousClass07a.A00(r6), new C61860pz(new C376959Jz(this, (AnonymousClass4D7) null, 22), 0u9.A04(r5.A0H)));
    }

    public static final int A00(C366258oa r6) {
        AnonymousClass8DM r62 = r6.A05;
        int B0a = r62.B0a();
        int i = 0;
        while (true) {
            if (i >= B0a) {
                break;
            }
            AnonymousClass87G B0Q = r62.B0Q(i);
            if (B0Q == null || B0Q.A04 != AnonymousClass87I.EMPTY) {
                i++;
            } else if (i != -1) {
                return i;
            }
        }
        0kD.A07("PostCaptureEffectPickerController", 002.A0O("getEmptyEffectPosition() invalid emptyEffectPosition ", -1), (Throwable) null);
        return 0;
    }

    public static final void A01(C366258oa r4) {
        if (!r4.A00) {
            r4.A00 = true;
            AnonymousClass8DM r1 = r4.A05;
            r1.DCI();
            r1.setVisibility(0);
            2cs r2 = r4.A02;
            r2.A08(0.0d, true);
            r2.A06(1.0d);
            ((C366308of) r4.A0A.getValue()).A00();
        }
    }

    public static final void A02(C366258oa r4, String str) {
        AnonymousClass8DM r1 = r4.A05;
        r1.EDb(r1.B0X(str));
        C366068o8 r42 = r4.A07;
        C318136oS A002 = C318116oQ.A00(r42);
        1Eo.A05(19B.A00, new MGE(r42, str, (AnonymousClass4D7) null, 39), A002);
        C366068o8.A01(AnonymousClass84B.DEFAULT, r42);
    }

    public static final void A03(C366258oa r4, String str, boolean z) {
        int B0X;
        AnonymousClass8DM r3 = r4.A05;
        if (r3.CZ5()) {
            if (str == null) {
                B0X = A00(r4);
            } else {
                B0X = r3.B0X(str);
            }
            if (r3.CZO(B0X)) {
                if (z) {
                    r3.EKh(B0X, true);
                } else {
                    r3.ELA((String) null, B0X, false);
                }
                ((C366308of) r4.A0A.getValue()).A00();
            }
        }
    }

    public static final boolean A04(AnonymousClass87G r6, C366258oa r7) {
        CameraAREffect A002 = r6.A00();
        C366068o8 r3 = r7.A07;
        String A012 = AnonymousClass8YC.A01((AnonymousClass84D) r3.A0G.A00.getValue());
        if (A002 != null && 2PP.A00(A002.A0K, A012)) {
            EffectAttribution Azz = ((C3503584i) r3.A09.A00.A00.A00()).Azz();
            28D r2 = r3.A01;
            if (A002.A0V == null) {
                0wb.A03("CameraAREffect", 002.A0R("Cannot open bottom sheet with null primary actions, Effect ID: ", A002.A0K));
            } else {
                String str = A002.A0C;
                if (str != null) {
                    EffectInfoAttributionConfiguration effectInfoAttributionConfiguration = new EffectInfoAttributionConfiguration(A002, str);
                    effectInfoAttributionConfiguration.A00 = Azz;
                    effectInfoAttributionConfiguration.A01 = EffectInfoBottomSheetMode.NORMAL;
                    EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration = new EffectInfoBottomSheetConfiguration();
                    effectInfoBottomSheetConfiguration.A02 = ImmutableList.of(effectInfoAttributionConfiguration);
                    effectInfoBottomSheetConfiguration.A00 = 1;
                    effectInfoBottomSheetConfiguration.A01 = r2;
                    effectInfoBottomSheetConfiguration.A06 = false;
                    C40314Aa9 aa9 = new C40314Aa9(r7);
                    Context context = r7.A0B.getContext();
                    if (context == null) {
                        return true;
                    }
                    LPQ.A02(context, C59725JVj.POST_CAPTURE, r7.A03, r3.A0C, effectInfoBottomSheetConfiguration, aa9, (C273414mX) null);
                    return true;
                }
            }
        }
        return false;
    }
}
