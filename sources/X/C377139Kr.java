package X;

import android.content.Context;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9Kr  reason: invalid class name and case insensitive filesystem */
public final class C377139Kr extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377139Kr(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean A0E;
        switch (this.A00) {
            case 0:
                AnonymousClass7P7 r0 = (AnonymousClass7P7) this.A01;
                return new AnonymousClass7RU(r0.A03, r0.A06, r0.A07, r0.A30);
            case 1:
                return new AnonymousClass7RT(((AnonymousClass7P7) this.A01).A04);
            case 2:
                return new NO3(((AnonymousClass7P7) this.A01).A08);
            case 3:
                return new AnonymousClass7PO((AnonymousClass7LB) this.A01);
            case 4:
                return new Object();
            case 5:
                AnonymousClass7P7 r02 = (AnonymousClass7P7) this.A01;
                return new C3262576a(r02.A06, r02.A07, r02.A08);
            case 6:
                AnonymousClass7P7 r03 = (AnonymousClass7P7) this.A01;
                return new C3256673q(r03.A07, r03.A08, r03.A09, C3259574v.class);
            case 7:
                AnonymousClass7P7 r04 = (AnonymousClass7P7) this.A01;
                return new C3256673q(r04.A07, r04.A08, r04.A09, C68809NXt.class);
            case 8:
                AnonymousClass7P7 r05 = (AnonymousClass7P7) this.A01;
                return C395119zF.A00(r05.A06, r05.A07, r05.A08, r05.A09);
            case 9:
                return ((AnonymousClass7DP) ((AnonymousClass0eM) this.A01).getValue()).A01();
            case 10:
                return new AnonymousClass7DK(((AnonymousClass7P7) this.A01).A08);
            case 11:
                return new AnonymousClass7DC(((AnonymousClass7P7) this.A01).A08);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                AnonymousClass7P7 r06 = (AnonymousClass7P7) this.A01;
                C332807Wl r3 = r06.A08;
                return new AnonymousClass7DN(r06.A06, r06.A07, r3);
            case 13:
                AnonymousClass7P7 r07 = (AnonymousClass7P7) this.A01;
                return new AnonymousClass7D8(r07.A06, r07.A08);
            case 14:
                return ((AnonymousClass7DP) ((AnonymousClass0eM) this.A01).getValue()).A02();
            case 15:
                AnonymousClass7P7 r08 = (AnonymousClass7P7) this.A01;
                return new AnonymousClass7B9(r08.A04, r08.A08);
            case 16:
                return ((AnonymousClass7DP) ((AnonymousClass0eM) this.A01).getValue()).A00();
            case 17:
                return new AnonymousClass7D7(((AnonymousClass7P7) this.A01).A07);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new AnonymousClass7DO(((AnonymousClass7P7) this.A01).A08);
            case 19:
                AnonymousClass7P7 r09 = (AnonymousClass7P7) this.A01;
                return new AnonymousClass7DJ(r09.A07, r09.A08);
            case 20:
                AnonymousClass7P7 r010 = (AnonymousClass7P7) this.A01;
                return new AnonymousClass7DA(r010.A07, r010.A08);
            case 21:
                return new AnonymousClass7DB(((AnonymousClass7P7) this.A01).A08);
            case 22:
                AnonymousClass7P7 r011 = (AnonymousClass7P7) this.A01;
                return new AnonymousClass7D9(r011.A03, r011.A07, r011.A08);
            case 23:
                AnonymousClass7P7 r012 = (AnonymousClass7P7) this.A01;
                return PB0.A00(r012.A06, r012.A08, r012.A09);
            case 24:
                AnonymousClass7P7 r013 = (AnonymousClass7P7) this.A01;
                return new AnonymousClass7DF(r013.A07, r013.A08);
            case 25:
                return new AnonymousClass7DL(((AnonymousClass7P7) this.A01).A08);
            case 26:
                AnonymousClass7P7 r014 = (AnonymousClass7P7) this.A01;
                AnonymousClass9HC r4 = r014.A09;
                return new AnonymousClass7D4(r014.A06, r014.A07, r014.A08, r4);
            case 27:
                AnonymousClass7P7 r015 = (AnonymousClass7P7) this.A01;
                return new AnonymousClass7D6(r015.A06, r015.A08);
            case 28:
                return AnonymousClass7P7.A00((AnonymousClass7P7) this.A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return AnonymousClass7P7.A01((AnonymousClass7P7) this.A01);
            case 30:
                AnonymousClass7P7 r016 = (AnonymousClass7P7) this.A01;
                return new C72552PAj(r016.A06, r016.A08, r016.A09);
            case 31:
                return new AnonymousClass7DE(((AnonymousClass7P7) this.A01).A08);
            case 32:
                AnonymousClass7P7 r017 = (AnonymousClass7P7) this.A01;
                return new C72546PAd(r017.A06, r017.A07, r017.A08, r017.A09);
            case 33:
                AnonymousClass7P7 r018 = (AnonymousClass7P7) this.A01;
                return new AnonymousClass7D3(r018.A06, r018.A07, r018.A08);
            case 34:
                AnonymousClass7P7 r019 = (AnonymousClass7P7) this.A01;
                return new AnonymousClass7DD(r019.A03, r019.A07, r019.A08);
            case 35:
                AnonymousClass7P7 r020 = (AnonymousClass7P7) this.A01;
                return new AnonymousClass7DG(r020.A03, r020.A07, r020.A08);
            case 36:
                AnonymousClass7P7 r021 = (AnonymousClass7P7) this.A01;
                Context context = r021.A04;
                C332807Wl r42 = r021.A08;
                UserSession userSession = r021.A07;
                AnonymousClass0iw r1 = r021.A06;
                0qQ.A0B(r1, 3);
                return new PB3(context, r1, userSession, r42);
            case 37:
                AnonymousClass7P7 r022 = (AnonymousClass7P7) this.A01;
                UserSession userSession2 = r022.A07;
                C332807Wl r32 = r022.A08;
                AnonymousClass9HC r2 = r022.A09;
                AnonymousClass0iw r12 = r022.A06;
                0qQ.A0B(r12, 3);
                return new C72556PAn(r12, userSession2, r32, AnonymousClass7TG.A0d(r32, r2));
            case 38:
                AnonymousClass7P7 r023 = (AnonymousClass7P7) this.A01;
                return new AnonymousClass7DM(r023.A07, r023.A08);
            case 39:
                AnonymousClass7P7 r024 = (AnonymousClass7P7) this.A01;
                return AnonymousClass768.A00(r024.A08, r024.A09);
            case 40:
                AnonymousClass7P7 r025 = (AnonymousClass7P7) this.A01;
                return new AnonymousClass7DH(r025.A07, r025.A08);
            case Seq.NULL_REFNUM:
                List<String> A0R = 00l.A0R(182.A04(0Tu.A05, ((AnonymousClass7LO) this.A01).A01, 36882078171791791L), new String[]{","}, 0);
                int A0L = 0se.A0L(0Yv.A1E(A0R, 10));
                if (A0L < 16) {
                    A0L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
                for (String A0R2 : A0R) {
                    List A0R3 = 00l.A0R(A0R2, new String[]{":"}, 0);
                    linkedHashMap.put(Integer.valueOf(Integer.parseInt((String) A0R3.get(0))), Integer.valueOf(Integer.parseInt((String) A0R3.get(1))));
                }
                return linkedHashMap;
            case Seq.RefTracker.REF_OFFSET:
                return new C327367Am(((AnonymousClass7LE) this.A01).A0A);
            case 43:
                AnonymousClass7LE r33 = (AnonymousClass7LE) this.A01;
                if (Systrace.A0E(1)) {
                    0fS.A01("ViewTypeMapper.map", 1593770994);
                }
                try {
                    0eP[] r112 = new 0eP[173];
                    System.arraycopy(new 0eP[]{new 0eP(15, new 0eP(new C66841MdZ(r33, 38), AnonymousClass7LE.A02(r33).A1E)), new 0eP(23, new 0eP(new C66841MdZ(r33, 49), AnonymousClass7LE.A02(r33).A1W)), new 0eP(70, new 0eP(new C74183PqP(r33, 10), AnonymousClass7LE.A02(r33).A0Y)), new 0eP(71, new 0eP(new C74183PqP(r33, 21), AnonymousClass7LE.A02(r33).A0f)), new 0eP(72, new 0eP(new C74183PqP(r33, 32), AnonymousClass7LE.A02(r33).A0b)), new 0eP(74, new 0eP(new C74183PqP(r33, 43), AnonymousClass7LE.A02(r33).A0Z)), new 0eP(112, new 0eP(new C74181PqN(r33, 4), AnonymousClass7LE.A02(r33).A0d)), new 0eP(134, new 0eP(new C74181PqN(r33, 15), AnonymousClass7LE.A02(r33).A0g)), new 0eP(138, new 0eP(new C74181PqN(r33, 26), AnonymousClass7LE.A02(r33).A0c)), new 0eP(150, new 0eP(new C74182PqO(r33, 14), AnonymousClass7LE.A02(r33).A0a)), new 0eP(45, new 0eP(new C74182PqO(r33, 25), AnonymousClass7LE.A02(r33).A24)), new 0eP(Integer.valueOf(C11152SCh.MAX_FACTORIAL), new 0eP(new C74182PqO(r33, 36), AnonymousClass7LE.A02(r33).A0X)), new 0eP(46, new 0eP(new C74182PqO(r33, 47), AnonymousClass7LE.A02(r33).A1f)), new 0eP(116, new 0eP(new C66841MdZ(r33, 8), AnonymousClass7LE.A02(r33).A0M)), new 0eP(21, new 0eP(new C66841MdZ(r33, 19), AnonymousClass7LE.A02(r33).A1G)), new 0eP(13, new 0eP(new C66841MdZ(r33, 30), AnonymousClass7LE.A02(r33).A1C)), new 0eP(14, new 0eP(new C66841MdZ(r33, 35), AnonymousClass7LE.A02(r33).A1D)), new 0eP(78, new 0eP(new C66841MdZ(r33, 36), AnonymousClass7LE.A02(r33).A1c)), new 0eP(43, new 0eP(new C66841MdZ(r33, 37), AnonymousClass7LE.A02(r33).A18)), new 0eP(115, new 0eP(new C66841MdZ(r33, 39), AnonymousClass7LE.A02(r33).A1o)), new 0eP(44, new 0eP(new C66841MdZ(r33, 40), AnonymousClass7LE.A02(r33).A1d)), new 0eP(27, new 0eP(new C66841MdZ(r33, 41), AnonymousClass7LE.A02(r33).A1B)), new 0eP(26, new 0eP(new C66841MdZ(r33, 42), AnonymousClass7LE.A02(r33).A1e)), new 0eP(17, new 0eP(new C66841MdZ(r33, 43), AnonymousClass7LE.A02(r33).A1O)), new 0eP(20, new 0eP(new C66841MdZ(r33, 44), AnonymousClass7LE.A02(r33).A1P)), new 0eP(30, new 0eP(new C66841MdZ(r33, 45), AnonymousClass7LE.A02(r33).A1h)), new 0eP(7, new 0eP(new C66841MdZ(r33, 46), AnonymousClass7LE.A02(r33).A0v))}, 0, r112, 0, 27);
                    System.arraycopy(new 0eP[]{new 0eP(3, new 0eP(new C66841MdZ(r33, 47), AnonymousClass7LE.A02(r33).A0C)), new 0eP(181, new 0eP(new C66841MdZ(r33, 48), AnonymousClass7LE.A02(r33).A22)), new 0eP(182, new 0eP(new C74183PqP(r33, 0), AnonymousClass7LE.A02(r33).A2N)), new 0eP(25, new 0eP(new C74183PqP(r33, 1), AnonymousClass7LE.A02(r33).A1Z)), new 0eP(81, new 0eP(new C74183PqP(r33, 2), AnonymousClass7LE.A02(r33).A1a)), new 0eP(62, new 0eP(new C74183PqP(r33, 3), AnonymousClass7LE.A02(r33).A2w)), new 0eP(11, new 0eP(new C74183PqP(r33, 4), AnonymousClass7LE.A02(r33).A19)), new 0eP(12, new 0eP(new C74183PqP(r33, 5), AnonymousClass7LE.A02(r33).A1A)), new 0eP(1, new 0eP(new C74183PqP(r33, 6), AnonymousClass7LE.A02(r33).A0B)), new 0eP(162, new 0eP(new C74183PqP(r33, 7), AnonymousClass7LE.A02(r33).A14)), new 0eP(58, new 0eP(new C74183PqP(r33, 8), AnonymousClass7LE.A02(r33).A2V)), new 0eP(29, new 0eP(new C74183PqP(r33, 9), AnonymousClass7LE.A02(r33).A1g)), new 0eP(56, new 0eP(new C74183PqP(r33, 11), AnonymousClass7LE.A02(r33).A2S)), new 0eP(57, new 0eP(new C74183PqP(r33, 12), AnonymousClass7LE.A02(r33).A2U)), new 0eP(32, new 0eP(new C74183PqP(r33, 13), AnonymousClass7LE.A02(r33).A1u)), new 0eP(2, new 0eP(new C74183PqP(r33, 14), AnonymousClass7LE.A02(r33).A02)), new 0eP(18, new 0eP(new C74183PqP(r33, 15), AnonymousClass7LE.A02(r33).A1s)), new 0eP(19, new 0eP(new C74183PqP(r33, 16), AnonymousClass7LE.A02(r33).A1t)), new 0eP(61, new 0eP(new C74183PqP(r33, 17), AnonymousClass7LE.A02(r33).A2n)), new 0eP(31, new 0eP(new C74183PqP(r33, 18), AnonymousClass7LE.A02(r33).A1p)), new 0eP(54, new 0eP(new C74183PqP(r33, 19), AnonymousClass7LE.A02(r33).A2K)), new 0eP(8, new 0eP(new C74183PqP(r33, 20), AnonymousClass7LE.A02(r33).A1r)), new 0eP(4, new 0eP(new C74183PqP(r33, 22), AnonymousClass7LE.A02(r33).A1q)), new 0eP(102, new 0eP(new C74183PqP(r33, 23), AnonymousClass7LE.A02(r33).A0H)), new 0eP(104, new 0eP(new C74183PqP(r33, 24), AnonymousClass7LE.A02(r33).A0F)), new 0eP(141, new 0eP(new C74183PqP(r33, 25), AnonymousClass7LE.A02(r33).A0K)), new 0eP(142, new 0eP(new C74183PqP(r33, 26), AnonymousClass7LE.A02(r33).A0I))}, 0, r112, 27, 27);
                    System.arraycopy(new 0eP[]{new 0eP(143, new 0eP(new C74183PqP(r33, 27), AnonymousClass7LE.A02(r33).A0J)), new 0eP(147, new 0eP(new C74183PqP(r33, 28), AnonymousClass7LE.A02(r33).A0E)), new 0eP(148, new 0eP(new C74183PqP(r33, 29), AnonymousClass7LE.A02(r33).A0D)), new 0eP(103, new 0eP(new C74183PqP(r33, 30), AnonymousClass7LE.A02(r33).A0z)), new 0eP(106, new 0eP(new C74183PqP(r33, 31), AnonymousClass7LE.A02(r33).A0y)), new 0eP(108, new 0eP(new C74183PqP(r33, 33), AnonymousClass7LE.A02(r33).A12)), new 0eP(109, new 0eP(new C74183PqP(r33, 34), AnonymousClass7LE.A02(r33).A10)), new 0eP(110, new 0eP(new C74183PqP(r33, 35), AnonymousClass7LE.A02(r33).A11)), new 0eP(144, new 0eP(new C74183PqP(r33, 36), AnonymousClass7LE.A02(r33).A0x)), new 0eP(145, new 0eP(new C74183PqP(r33, 37), AnonymousClass7LE.A02(r33).A0w)), new 0eP(22, new 0eP(new C74183PqP(r33, 38), AnonymousClass7LE.A02(r33).A1S)), new 0eP(5, new 0eP(new C74183PqP(r33, 39), AnonymousClass7LE.A02(r33).A0L)), new 0eP(39, new 0eP(new C74183PqP(r33, 40), AnonymousClass7LE.A02(r33).A21)), new 0eP(50, new 0eP(new C74183PqP(r33, 41), AnonymousClass7LE.A02(r33).A2O)), new 0eP(47, new 0eP(new C74183PqP(r33, 42), AnonymousClass7LE.A02(r33).A2C)), new 0eP(89, new 0eP(new C74183PqP(r33, 44), AnonymousClass7LE.A02(r33).A29)), new 0eP(90, new 0eP(new C74183PqP(r33, 45), AnonymousClass7LE.A02(r33).A25)), new 0eP(49, new 0eP(new C74183PqP(r33, 46), AnonymousClass7LE.A02(r33).A2I)), new 0eP(85, new 0eP(new C74183PqP(r33, 47), AnonymousClass7LE.A02(r33).A0h)), new 0eP(48, new 0eP(new C74183PqP(r33, 48), AnonymousClass7LE.A02(r33).A2E)), new 0eP(77, new 0eP(new C74183PqP(r33, 49), AnonymousClass7LE.A02(r33).A2A)), new 0eP(83, new 0eP(new C74181PqN(r33, 0), AnonymousClass7LE.A02(r33).A17)), new 0eP(84, new 0eP(new C74181PqN(r33, 1), AnonymousClass7LE.A02(r33).A28)), new 0eP(94, new 0eP(new C74181PqN(r33, 2), AnonymousClass7LE.A02(r33).A2G)), new 0eP(95, new 0eP(new C74181PqN(r33, 3), AnonymousClass7LE.A02(r33).A27)), new 0eP(189, new 0eP(new C74181PqN(r33, 5), AnonymousClass7LE.A02(r33).A27)), new 0eP(82, new 0eP(new C74181PqN(r33, 6), AnonymousClass7LE.A02(r33).A1l))}, 0, r112, 54, 27);
                    System.arraycopy(new 0eP[]{new 0eP(111, new 0eP(new C74181PqN(r33, 7), AnonymousClass7LE.A02(r33).A2L)), new 0eP(107, new 0eP(new C74181PqN(r33, 8), AnonymousClass7LE.A02(r33).A2M)), new 0eP(97, new 0eP(new C74181PqN(r33, 9), AnonymousClass7LE.A02(r33).A0s)), new 0eP(171, new 0eP(new C74181PqN(r33, 10), AnonymousClass7LE.A02(r33).A1T)), new 0eP(180, new 0eP(new C74181PqN(r33, 11), AnonymousClass7LE.A02(r33).A0i)), new 0eP(183, new 0eP(new C74181PqN(r33, 12), AnonymousClass7LE.A02(r33).A1F)), new 0eP(172, new 0eP(new C74181PqN(r33, 13), AnonymousClass7LE.A02(r33).A2H)), new 0eP(174, new 0eP(new C74181PqN(r33, 14), AnonymousClass7LE.A02(r33).A2y)), new 0eP(175, new 0eP(new C74181PqN(r33, 16), AnonymousClass7LE.A02(r33).A2r)), new 0eP(176, new 0eP(new C74181PqN(r33, 17), AnonymousClass7LE.A02(r33).A2F)), new 0eP(177, new 0eP(new C74181PqN(r33, 18), AnonymousClass7LE.A02(r33).A0G)), new 0eP(173, new 0eP(new C74181PqN(r33, 19), AnonymousClass7LE.A02(r33).A2a)), new 0eP(160, new 0eP(new C74181PqN(r33, 20), AnonymousClass7LE.A02(r33).A0r)), new 0eP(113, new 0eP(new C74181PqN(r33, 21), AnonymousClass7LE.A02(r33).A0q)), new 0eP(128, new 0eP(new C74181PqN(r33, 22), AnonymousClass7LE.A02(r33).A0t)), new 0eP(122, new 0eP(new C74181PqN(r33, 23), AnonymousClass7LE.A02(r33).A0u)), new 0eP(129, new 0eP(new C74181PqN(r33, 24), AnonymousClass7LE.A02(r33).A0p)), new 0eP(130, new 0eP(new C74181PqN(r33, 25), AnonymousClass7LE.A02(r33).A0o)), new 0eP(146, new 0eP(new C74182PqO(r33, 4), AnonymousClass7LE.A02(r33).A0m)), new 0eP(87, new 0eP(new C74182PqO(r33, 5), AnonymousClass7LE.A02(r33).A2J)), new 0eP(53, new 0eP(new C74182PqO(r33, 6), AnonymousClass7LE.A02(r33).A2R)), new 0eP(59, new 0eP(new C74182PqO(r33, 7), AnonymousClass7LE.A02(r33).A2W)), new 0eP(51, new 0eP(new C74182PqO(r33, 8), AnonymousClass7LE.A02(r33).A2P)), new 0eP(37, new 0eP(new C74182PqO(r33, 9), AnonymousClass7LE.A02(r33).A1z)), new 0eP(35, new 0eP(new C74182PqO(r33, 10), AnonymousClass7LE.A02(r33).A1x)), new 0eP(34, new 0eP(new C74182PqO(r33, 11), AnonymousClass7LE.A02(r33).A1w)), new 0eP(68, new 0eP(new C74182PqO(r33, 12), AnonymousClass7LE.A02(r33).A1y))}, 0, r112, 81, 27);
                    System.arraycopy(new 0eP[]{new 0eP(60, new 0eP(new C74182PqO(r33, 13), AnonymousClass7LE.A02(r33).A2f)), new 0eP(52, new 0eP(new C74182PqO(r33, 15), AnonymousClass7LE.A02(r33).A2Q)), new 0eP(36, new 0eP(new C74182PqO(r33, 16), AnonymousClass7LE.A02(r33).A0W)), new 0eP(157, new 0eP(new C74182PqO(r33, 17), AnonymousClass7LE.A02(r33).A1j)), new 0eP(24, new 0eP(new C74182PqO(r33, 18), AnonymousClass7LE.A02(r33).A13)), new 0eP(6, new 0eP(new C74182PqO(r33, 19), AnonymousClass7LE.A02(r33).A0O)), new 0eP(65, new 0eP(new C74182PqO(r33, 20), AnonymousClass7LE.A02(r33).A0k)), new 0eP(184, new 0eP(new C74182PqO(r33, 21), AnonymousClass7LE.A02(r33).A0n)), new 0eP(75, new 0eP(new C74182PqO(r33, 22), AnonymousClass7LE.A02(r33).A16)), new 0eP(38, new 0eP(new C74182PqO(r33, 23), AnonymousClass7LE.A02(r33).A0l)), new 0eP(66, new 0eP(new C74182PqO(r33, 24), AnonymousClass7LE.A02(r33).A0P)), new 0eP(91, new 0eP(new C74182PqO(r33, 26), AnonymousClass7LE.A02(r33).A1i)), new 0eP(114, new 0eP(new C74182PqO(r33, 27), AnonymousClass7LE.A02(r33).A0A)), new 0eP(55, new 0eP(new C74182PqO(r33, 28), AnonymousClass7LE.A02(r33).A01)), new 0eP(158, new 0eP(new C74182PqO(r33, 29), AnonymousClass7LE.A02(r33).A0S)), new 0eP(67, new 0eP(new C74182PqO(r33, 30), AnonymousClass7LE.A02(r33).A1Y)), new 0eP(69, new 0eP(new C74182PqO(r33, 31), AnonymousClass7LE.A02(r33).A0R)), new 0eP(96, new 0eP(new C74182PqO(r33, 32), AnonymousClass7LE.A02(r33).A0e)), new 0eP(92, new 0eP(new C74182PqO(r33, 33), AnonymousClass7LE.A02(r33).A1Q)), new 0eP(105, new 0eP(new C74182PqO(r33, 34), AnonymousClass7LE.A02(r33).A1v)), new 0eP(93, new 0eP(new C74182PqO(r33, 35), AnonymousClass7LE.A02(r33).A0U)), new 0eP(188, new 0eP(new C74182PqO(r33, 37), AnonymousClass7LE.A02(r33).A0U)), new 0eP(98, new 0eP(new C74182PqO(r33, 38), AnonymousClass7LE.A02(r33).A20)), new 0eP(99, new 0eP(new C74182PqO(r33, 39), AnonymousClass7LE.A02(r33).A2z)), new 0eP(100, new 0eP(new C74182PqO(r33, 40), AnonymousClass7LE.A02(r33).A2x)), new 0eP(117, new 0eP(new C74182PqO(r33, 41), AnonymousClass7LE.A02(r33).A2s)), new 0eP(118, new 0eP(new C74182PqO(r33, 42), AnonymousClass7LE.A02(r33).A2q))}, 0, r112, 108, 27);
                    System.arraycopy(new 0eP[]{new 0eP(139, new 0eP(new C74182PqO(r33, 43), AnonymousClass7LE.A02(r33).A2p)), new 0eP(140, new 0eP(new C74182PqO(r33, 44), AnonymousClass7LE.A02(r33).A2o)), new 0eP(119, new 0eP(new C74182PqO(r33, 45), AnonymousClass7LE.A02(r33).A2v)), new 0eP(120, new 0eP(new C74182PqO(r33, 46), AnonymousClass7LE.A02(r33).A2t)), new 0eP(121, new 0eP(new C74182PqO(r33, 48), AnonymousClass7LE.A02(r33).A2u)), new 0eP(123, new 0eP(new C74182PqO(r33, 49), AnonymousClass7LE.A02(r33).A1K)), new 0eP(161, new 0eP(new C66841MdZ(r33, 0), AnonymousClass7LE.A02(r33).A2D)), new 0eP(124, new 0eP(new C66841MdZ(r33, 1), AnonymousClass7LE.A02(r33).A1J)), new 0eP(125, new 0eP(new C66841MdZ(r33, 2), AnonymousClass7LE.A02(r33).A1N)), new 0eP(126, new 0eP(new C66841MdZ(r33, 3), AnonymousClass7LE.A02(r33).A1L)), new 0eP(127, new 0eP(new C66841MdZ(r33, 4), AnonymousClass7LE.A02(r33).A1M)), new 0eP(151, new 0eP(new C66841MdZ(r33, 5), AnonymousClass7LE.A02(r33).A1I)), new 0eP(152, new 0eP(new C66841MdZ(r33, 6), AnonymousClass7LE.A02(r33).A1H)), new 0eP(131, new 0eP(new C66841MdZ(r33, 7), AnonymousClass7LE.A02(r33).A2b)), new 0eP(132, new 0eP(new C66841MdZ(r33, 9), AnonymousClass7LE.A02(r33).A2Z)), new 0eP(133, new 0eP(new C66841MdZ(r33, 10), AnonymousClass7LE.A02(r33).A2e)), new 0eP(153, new 0eP(new C66841MdZ(r33, 11), AnonymousClass7LE.A02(r33).A2Y)), new 0eP(154, new 0eP(new C66841MdZ(r33, 12), AnonymousClass7LE.A02(r33).A2X)), new 0eP(135, new 0eP(new C66841MdZ(r33, 13), AnonymousClass7LE.A02(r33).A2j)), new 0eP(136, new 0eP(new C66841MdZ(r33, 14), AnonymousClass7LE.A02(r33).A2i)), new 0eP(137, new 0eP(new C66841MdZ(r33, 15), AnonymousClass7LE.A02(r33).A2m)), new 0eP(155, new 0eP(new C66841MdZ(r33, 16), AnonymousClass7LE.A02(r33).A2h)), new 0eP(156, new 0eP(new C66841MdZ(r33, 17), AnonymousClass7LE.A02(r33).A2g)), new 0eP(149, new 0eP(new C66841MdZ(r33, 18), AnonymousClass7LE.A02(r33).A0V)), new 0eP(159, new 0eP(new C66841MdZ(r33, 20), AnonymousClass7LE.A02(r33).A1U)), new 0eP(166, new 0eP(new C66841MdZ(r33, 21), AnonymousClass7LE.A02(r33).A2k)), new 0eP(167, new 0eP(new C66841MdZ(r33, 22), AnonymousClass7LE.A02(r33).A2l))}, 0, r112, 135, 27);
                    System.arraycopy(new 0eP[]{new 0eP(165, new 0eP(new C66841MdZ(r33, 23), AnonymousClass7LE.A02(r33).A2d)), new 0eP(164, new 0eP(new C66841MdZ(r33, 24), AnonymousClass7LE.A02(r33).A2c)), new 0eP(163, new 0eP(new C66841MdZ(r33, 25), AnonymousClass7LE.A02(r33).A0N)), new 0eP(168, new 0eP(new C66841MdZ(r33, 26), AnonymousClass7LE.A02(r33).A15)), new 0eP(169, new 0eP(new C66841MdZ(r33, 27), AnonymousClass7LE.A02(r33).A0j)), new 0eP(178, new 0eP(new C66841MdZ(r33, 28), AnonymousClass7LE.A02(r33).A0Q)), new 0eP(179, new 0eP(new C66841MdZ(r33, 29), AnonymousClass7LE.A02(r33).A2T)), new 0eP(185, new 0eP(new C66841MdZ(r33, 31), AnonymousClass7LE.A02(r33).A2B)), new 0eP(187, new 0eP(new C66841MdZ(r33, 32), AnonymousClass7LE.A02(r33).A1V)), new 0eP(186, new 0eP(new C66841MdZ(r33, 33), AnonymousClass7LE.A02(r33).A1R)), new 0eP(191, new 0eP(new C66841MdZ(r33, 34), AnonymousClass7LE.A02(r33).A23))}, 0, r112, 162, 11);
                    LinkedHashMap A06 = 0Yt.A06(r112);
                    if (A0E) {
                        return A06;
                    }
                    return A06;
                } finally {
                    if (Systrace.A0E(1)) {
                        0fS.A00(-791807502);
                    }
                }
            case 44:
                AnonymousClass7LE r026 = (AnonymousClass7LE) this.A01;
                return C331497Rf.A00(r026.A07, r026.A0D);
            case 45:
                List<String> A0R4 = 00l.A0R(182.A04(0Tu.A05, ((AnonymousClass7LF) this.A01).A00, 36889645904036696L), new String[]{","}, 0);
                HashSet hashSet = new HashSet();
                for (String A0l : A0R4) {
                    Integer A0l2 = 00y.A0l(A0l);
                    if (A0l2 != null) {
                        hashSet.add(A0l2);
                    }
                }
                return hashSet;
            case 46:
                return new AnonymousClass7AL(((AnonymousClass7AR) this.A01).A00);
            case 47:
                return Boolean.valueOf(182.A06(0Tu.A05, (0lg) this.A01, 2342154247577010651L));
            case 48:
                return Boolean.valueOf(182.A06(0Tu.A05, (0lg) this.A01, 2342153298389237766L));
            default:
                return Boolean.valueOf(182.A06(0Tu.A05, (0lg) this.A01, 2342154780152955657L));
        }
    }
}
