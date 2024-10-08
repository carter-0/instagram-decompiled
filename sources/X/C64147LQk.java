package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.uploadflow.common.IGTVUploadProgress;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.LQk  reason: case insensitive filesystem */
public final class C64147LQk {
    public int A00;
    public IGTVUploadProgress A01;
    public boolean A02;
    public final FragmentActivity A03;
    public final UserSession A04;
    public final UserSession A05;
    public final C63775L6h A06;
    public final C62091KZv A07;
    public final C62091KZv A08;
    public final String A09;
    public final AnonymousClass0eM A0A;

    public /* synthetic */ C64147LQk(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, C63775L6h l6h, String str) {
        C66399MQf mQf = C65406Lsm.A00;
        if (bundle != null) {
            LCp lCp = new LCp();
            int i = bundle.getInt("uploadnavigator.extra.saved_current_state");
            if (i != 0) {
                mQf = (C66399MQf) C51968G9o.A10(lCp.A00, i);
                if (mQf == null) {
                    throw DbW.A0b("Navigation state not found for index: ", i);
                }
            } else {
                throw AnonymousClass7TE.A0z("Navigation state index not found in restore bundle");
            }
        }
        C62091KZv kZv = new C62091KZv(mQf);
        KTK ktk = KTK.A00;
        C65392LsY lsY = C65392LsY.A00;
        kZv.A08(lsY, ktk);
        KTJ ktj = KTJ.A00;
        C65384LsQ lsQ = C65384LsQ.A00;
        kZv.A08(lsQ, ktj);
        KTL ktl = KTL.A00;
        C65385LsR lsR = C65385LsR.A00;
        kZv.A08(lsR, ktl);
        KTM ktm = KTM.A00;
        C65388LsU lsU = C65388LsU.A00;
        kZv.A08(lsU, ktm);
        KTN ktn = KTN.A00;
        C65393LsZ lsZ = C65393LsZ.A00;
        kZv.A08(lsZ, ktn);
        KT8 kt8 = KT8.A00;
        C61945KSu kSu = C61945KSu.A00;
        kZv.A06(lsY, lsQ, kt8, kSu);
        kZv.A06(lsQ, lsZ, kt8, kSu);
        KT5 kt5 = KT5.A00;
        C65394Lsa lsa = C65394Lsa.A00;
        C63298Kuh.A00(kZv, lsZ, lsa, kt5, false);
        C63298Kuh.A00(kZv, lsZ, lsR, KT9.A00, false);
        C65404Lsk lsk = C65404Lsk.A00;
        C63298Kuh.A00(kZv, lsk, C65403Lsj.A00, KT2.A00, true);
        C63298Kuh.A00(kZv, lsZ, lsk, KTB.A00, true);
        C63298Kuh.A00(kZv, lsZ, lsU, KTC.A00, false);
        C63298Kuh.A00(kZv, lsa, C65389LsV.A00, KT4.A00, false);
        C63298Kuh.A00(kZv, lsa, C65386LsS.A00, KT3.A00, false);
        C63298Kuh.A00(kZv, lsa, C65407Lsn.A00, C61946KSv.A00, false);
        kZv.A05(lsZ, C65397Lsd.A00, KTH.class);
        kZv.A05(lsZ, C65398Lse.A00, KTD.class);
        kZv.A05(lsZ, C65396Lsc.A00, KTI.class);
        kZv.A05(lsa, C65395Lsb.A00, KTE.class);
        kZv.A05(lsZ, C65399Lsf.A00, KTF.class);
        kZv.A05(lsZ, C65400Lsg.A00, KTG.class);
        KT6 kt6 = KT6.A00;
        C65387LsT lsT = C65387LsT.A00;
        C63298Kuh.A00(kZv, lsZ, lsT, kt6, false);
        C63298Kuh.A00(kZv, lsZ, C65401Lsh.A00, KT7.A00, false);
        KTA kta = KTA.A00;
        C65391LsX lsX = C65391LsX.A00;
        kZv.A06(lsR, lsX, kta, kSu);
        KTR ktr = KTR.A00;
        0qQ.A0B(ktr, 1);
        Class<?> cls = ktr.getClass();
        kZv.A03(cls, lsX, lsX);
        C65390LsW lsW = C65390LsW.A00;
        kZv.A06(lsT, lsW, kta, kSu);
        kZv.A03(cls, lsW, lsW);
        kZv.A06(lsU, lsX, kta, kSu);
        kZv.A03(cls, lsX, lsX);
        kZv.A07(lsQ, KT1.A00);
        kZv.A07(lsQ, C61948KSx.A00);
        kZv.A07(lsZ, C61950KSz.A00);
        kZv.A07(lsZ, KT0.A00);
        kZv.A07(lsZ, C61947KSw.A00);
        kZv.A07(lsZ, C61949KSy.A00);
        String str2 = str;
        0qQ.A0B(str2, 5);
        this.A07 = kZv;
        this.A03 = fragmentActivity;
        this.A04 = userSession;
        kZv.A02(new C59966Jcb(this, 4));
        this.A05 = userSession;
        this.A06 = l6h;
        this.A09 = str2;
        this.A08 = kZv;
        this.A0A = C66306MMp.A01(this, 13);
        this.A01 = new IGTVUploadProgress((C62581KiE) null, (L8E) null, (DefaultConstructorMarker) null, 3);
        if (bundle != null) {
            LCp lCp2 = new LCp();
            int i2 = bundle.getInt("uploadnavigator.extra.saved_start_state");
            if (i2 != 0) {
                C66399MQf mQf2 = (C66399MQf) C51968G9o.A10(lCp2.A00, i2);
                if (mQf2 != null) {
                    kZv.A00 = mQf2;
                    this.A00 = bundle.getInt("uploadnavigator.extra.num_system_save");
                    IGTVUploadProgress iGTVUploadProgress = (IGTVUploadProgress) bundle.getParcelable("uploadnavigator.extra.upload_flow_progress");
                    this.A01 = iGTVUploadProgress == null ? new IGTVUploadProgress((C62581KiE) null, (L8E) null, (DefaultConstructorMarker) null, 3) : iGTVUploadProgress;
                    this.A0A.getValue();
                    0qQ.A07(this.A07.A00.first);
                    return;
                }
                throw DbW.A0b("Navigation state not found for index: ", i2);
            }
            throw AnonymousClass7TE.A0z("Navigation state index not found in restore bundle");
        }
    }

    public static final void A01(C66399MQf mQf, Object obj) {
        if (mQf instanceof MSS) {
            0qQ.A0C(((MSS) mQf).B7q(obj), C66579MXk.A00(2));
            return;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("NavigationState with action: ");
        A1A.append(obj);
        throw AnonymousClass7TE.A0z(AnonymousClass7TG.A0m(mQf, " is not a FragmentDestination: ", A1A));
    }

    public static final void A00(FragmentActivity fragmentActivity, C64147LQk lQk, IGTVUploadProgress iGTVUploadProgress, int i) {
        Intent intent = fragmentActivity.getIntent();
        if (intent != null && intent.getIntExtra("uploadflow.extra.upload_request_code", -1) >= 0) {
            Intent A092 = DbS.A09();
            A092.putExtra("igtvplugin.extra.composer_session_id", lQk.A09);
            A092.putExtra("igtvplugin.extra.upload_progress", iGTVUploadProgress);
            fragmentActivity.setResult(i, A092);
        }
    }
}
