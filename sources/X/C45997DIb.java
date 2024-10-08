package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.api.schemas.MediaReminder;
import com.instagram.feed.media.ReelCTAIntf;
import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.DIb  reason: case insensitive filesystem */
public final class C45997DIb extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45997DIb(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                List<DTP> list = (List) this.A01;
                if (list == null) {
                    return null;
                }
                ArrayList A0r = AnonymousClass7TG.A0r(list);
                for (DTP FHC : list) {
                    A0r.add(FHC.FHC());
                }
                return A0r;
            case 1:
                List<C46307DUk> list2 = (List) this.A01;
                if (list2 == null) {
                    return null;
                }
                ArrayList A0r2 = AnonymousClass7TG.A0r(list2);
                for (C46307DUk FHC2 : list2) {
                    A0r2.add(FHC2.FHC());
                }
                return A0r2;
            case 2:
                C257803xz r0 = (C257803xz) this.A01;
                if (r0 != null) {
                    return r0.FHC();
                }
                return null;
            case 3:
                List<AnonymousClass4B1> list3 = (List) this.A01;
                if (list3 == null) {
                    return null;
                }
                ArrayList A0r3 = AnonymousClass7TG.A0r(list3);
                for (AnonymousClass4B1 FHC3 : list3) {
                    A0r3.add(FHC3.FHC());
                }
                return A0r3;
            case 4:
                DU9 du9 = (DU9) this.A01;
                if (du9 != null) {
                    return du9.FHC();
                }
                return null;
            case 5:
                MediaReminder mediaReminder = (MediaReminder) this.A01;
                if (mediaReminder != null) {
                    return mediaReminder.FHC();
                }
                return null;
            case 6:
                C46300DUd dUd = (C46300DUd) this.A01;
                if (dUd != null) {
                    return dUd.FHC();
                }
                return null;
            case 10:
                C46283DTm dTm = (C46283DTm) this.A01;
                if (dTm != null) {
                    return dTm.FHC();
                }
                return null;
            case 11:
                DUA dua = (DUA) this.A01;
                if (dua != null) {
                    return dua.FHC();
                }
                return null;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C275654qh r02 = (C275654qh) this.A01;
                if (r02 != null) {
                    return r02.FHC();
                }
                return null;
            case 13:
                List list4 = (List) this.A01;
                if (list4 == null) {
                    return null;
                }
                ArrayList A0r4 = AnonymousClass7TG.A0r(list4);
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    C41846B3n.A1T(A0r4, it);
                }
                return A0r4;
            case 15:
                C65251bZ r03 = (C65251bZ) this.A01;
                if (r03 != null) {
                    return r03.FHC();
                }
                return null;
            case 16:
                C257943yD r04 = (C257943yD) this.A01;
                if (r04 != null) {
                    return r04.FHC();
                }
                return null;
            case 17:
                List list5 = (List) this.A01;
                if (list5 == null) {
                    return null;
                }
                ArrayList A0r5 = AnonymousClass7TG.A0r(list5);
                Iterator it2 = list5.iterator();
                while (it2.hasNext()) {
                    C41846B3n.A1U(A0r5, it2);
                }
                return A0r5;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                IgShowreelNativeAnimationIntf igShowreelNativeAnimationIntf = (IgShowreelNativeAnimationIntf) this.A01;
                if (igShowreelNativeAnimationIntf != null) {
                    return igShowreelNativeAnimationIntf.FHC();
                }
                return null;
            case 19:
                IgShowreelComposition igShowreelComposition = (IgShowreelComposition) this.A01;
                if (igShowreelComposition != null) {
                    return igShowreelComposition.FHC();
                }
                return null;
            case 20:
                List<C258223yf> list6 = (List) this.A01;
                if (list6 == null) {
                    return null;
                }
                ArrayList A0r6 = AnonymousClass7TG.A0r(list6);
                for (C258223yf FHC4 : list6) {
                    A0r6.add(FHC4.FHC());
                }
                return A0r6;
            case 21:
                List<AnonymousClass536> list7 = (List) this.A01;
                if (list7 == null) {
                    return null;
                }
                ArrayList A0r7 = AnonymousClass7TG.A0r(list7);
                for (AnonymousClass536 FHC5 : list7) {
                    A0r7.add(FHC5.FHC());
                }
                return A0r7;
            case 22:
                List<C46315DUs> list8 = (List) this.A01;
                if (list8 == null) {
                    return null;
                }
                ArrayList A0r8 = AnonymousClass7TG.A0r(list8);
                for (C46315DUs FHC6 : list8) {
                    A0r8.add(FHC6.FHC());
                }
                return A0r8;
            case 23:
                C46315DUs dUs = (C46315DUs) this.A01;
                if (dUs != null) {
                    return dUs.FHC();
                }
                return null;
            case 24:
                List<C22560YBa> list9 = (List) this.A01;
                if (list9 == null) {
                    return null;
                }
                ArrayList A0r9 = AnonymousClass7TG.A0r(list9);
                for (C22560YBa FHC7 : list9) {
                    A0r9.add(FHC7.FHC());
                }
                return A0r9;
            case 25:
                C250723lx r05 = (C250723lx) this.A01;
                if (r05 != null) {
                    return r05.FHC();
                }
                return null;
            case 26:
                C250753m0 r06 = (C250753m0) this.A01;
                if (r06 != null) {
                    return r06.FHC();
                }
                return null;
            case 27:
                List<C22565YBf> list10 = (List) this.A01;
                if (list10 == null) {
                    return null;
                }
                ArrayList A0r10 = AnonymousClass7TG.A0r(list10);
                for (C22565YBf FHC8 : list10) {
                    A0r10.add(FHC8.FHC());
                }
                return A0r10;
            case 28:
                List<C22566YBg> list11 = (List) this.A01;
                if (list11 == null) {
                    return null;
                }
                ArrayList A0r11 = AnonymousClass7TG.A0r(list11);
                for (C22566YBg FHC9 : list11) {
                    A0r11.add(FHC9.FHC());
                }
                return A0r11;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                C2808054e r07 = (C2808054e) this.A01;
                if (r07 != null) {
                    return r07.FHC();
                }
                return null;
            case 30:
                List<YC5> list12 = (List) this.A01;
                if (list12 == null) {
                    return null;
                }
                ArrayList A0r12 = AnonymousClass7TG.A0r(list12);
                for (YC5 FHC10 : list12) {
                    A0r12.add(FHC10.FHC());
                }
                return A0r12;
            case 31:
                List<C46287DTq> list13 = (List) this.A01;
                if (list13 == null) {
                    return null;
                }
                ArrayList A0r13 = AnonymousClass7TG.A0r(list13);
                for (C46287DTq FHC11 : list13) {
                    A0r13.add(FHC11.FHC());
                }
                return A0r13;
            case 32:
                List<XB0> list14 = (List) this.A01;
                if (list14 == null) {
                    return null;
                }
                ArrayList A0r14 = AnonymousClass7TG.A0r(list14);
                for (XB0 FHC12 : list14) {
                    A0r14.add(FHC12.FHC());
                }
                return A0r14;
            case 33:
                List<C22567YBh> list15 = (List) this.A01;
                if (list15 == null) {
                    return null;
                }
                ArrayList A0r15 = AnonymousClass7TG.A0r(list15);
                for (C22567YBh FHC13 : list15) {
                    A0r15.add(FHC13.FHC());
                }
                return A0r15;
            case 34:
                List<C22568YBi> list16 = (List) this.A01;
                if (list16 == null) {
                    return null;
                }
                ArrayList A0r16 = AnonymousClass7TG.A0r(list16);
                for (C22568YBi FHC14 : list16) {
                    A0r16.add(FHC14.FHC());
                }
                return A0r16;
            case 35:
                List<XB1> list17 = (List) this.A01;
                if (list17 == null) {
                    return null;
                }
                ArrayList A0r17 = AnonymousClass7TG.A0r(list17);
                for (XB1 FHC15 : list17) {
                    A0r17.add(FHC15.FHC());
                }
                return A0r17;
            case 36:
                List<C65211bM> list18 = (List) this.A01;
                if (list18 == null) {
                    return null;
                }
                ArrayList A0r18 = AnonymousClass7TG.A0r(list18);
                for (C65211bM FHC16 : list18) {
                    A0r18.add(FHC16.FHC());
                }
                return A0r18;
            case 37:
                List<C22569YBj> list19 = (List) this.A01;
                if (list19 == null) {
                    return null;
                }
                ArrayList A0r19 = AnonymousClass7TG.A0r(list19);
                for (C22569YBj FHC17 : list19) {
                    A0r19.add(FHC17.FHC());
                }
                return A0r19;
            case 38:
                List<ReelCTAIntf> list20 = (List) this.A01;
                if (list20 == null) {
                    return null;
                }
                ArrayList A0r20 = AnonymousClass7TG.A0r(list20);
                for (ReelCTAIntf FHC18 : list20) {
                    A0r20.add(FHC18.FHC());
                }
                return A0r20;
            case 39:
                List<C22570YBk> list21 = (List) this.A01;
                if (list21 == null) {
                    return null;
                }
                ArrayList A0r21 = AnonymousClass7TG.A0r(list21);
                for (C22570YBk FHC19 : list21) {
                    A0r21.add(FHC19.FHC());
                }
                return A0r21;
            case 40:
                C258033yM r08 = (C258033yM) this.A01;
                if (r08 != null) {
                    return r08.FHC();
                }
                return null;
            case Seq.NULL_REFNUM:
                List<C22561YBb> list22 = (List) this.A01;
                if (list22 == null) {
                    return null;
                }
                ArrayList A0r22 = AnonymousClass7TG.A0r(list22);
                for (C22561YBb FHC20 : list22) {
                    A0r22.add(FHC20.FHC());
                }
                return A0r22;
            case Seq.RefTracker.REF_OFFSET:
                List<C22571YBl> list23 = (List) this.A01;
                if (list23 == null) {
                    return null;
                }
                ArrayList A0r23 = AnonymousClass7TG.A0r(list23);
                for (C22571YBl FHC21 : list23) {
                    A0r23.add(FHC21.FHC());
                }
                return A0r23;
            case 43:
                List<YC9> list24 = (List) this.A01;
                if (list24 == null) {
                    return null;
                }
                ArrayList A0r24 = AnonymousClass7TG.A0r(list24);
                for (YC9 FHC22 : list24) {
                    A0r24.add(FHC22.FHC());
                }
                return A0r24;
            case 44:
                List<C22572YBm> list25 = (List) this.A01;
                if (list25 == null) {
                    return null;
                }
                ArrayList A0r25 = AnonymousClass7TG.A0r(list25);
                for (C22572YBm FHC23 : list25) {
                    A0r25.add(FHC23.FHC());
                }
                return A0r25;
            case 45:
                List<C22573YBn> list26 = (List) this.A01;
                if (list26 == null) {
                    return null;
                }
                ArrayList A0r26 = AnonymousClass7TG.A0r(list26);
                for (C22573YBn FHC24 : list26) {
                    A0r26.add(FHC24.FHC());
                }
                return A0r26;
            case 46:
                List<C261604Af> list27 = (List) this.A01;
                if (list27 == null) {
                    return null;
                }
                ArrayList A0r27 = AnonymousClass7TG.A0r(list27);
                for (C261604Af FHC25 : list27) {
                    A0r27.add(FHC25.FHC());
                }
                return A0r27;
            case 47:
                List<C22574YBo> list28 = (List) this.A01;
                if (list28 == null) {
                    return null;
                }
                ArrayList A0r28 = AnonymousClass7TG.A0r(list28);
                for (C22574YBo FHC26 : list28) {
                    A0r28.add(FHC26.FHC());
                }
                return A0r28;
            case 48:
                List<DUR> list29 = (List) this.A01;
                if (list29 == null) {
                    return null;
                }
                ArrayList A0r29 = AnonymousClass7TG.A0r(list29);
                for (DUR FHC27 : list29) {
                    A0r29.add(FHC27.FHC());
                }
                return A0r29;
            case 49:
                List<C22575YBp> list30 = (List) this.A01;
                if (list30 == null) {
                    return null;
                }
                ArrayList A0r30 = AnonymousClass7TG.A0r(list30);
                for (C22575YBp FHC28 : list30) {
                    A0r30.add(FHC28.FHC());
                }
                return A0r30;
            default:
                User user = (User) this.A01;
                if (user != null) {
                    return user.A08();
                }
                return null;
        }
    }
}
