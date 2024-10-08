package X;

import android.content.Context;
import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.clips.audio.model.AudioPageAssetModel;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.IMb  reason: case insensitive filesystem */
public final class C57035IMb implements C270744hE, C270764hG {
    public static final long A05 = TimeUnit.MINUTES.toSeconds(60);
    public final int A00;
    public final MusicPageTabType A01;
    public final AudioPageAssetModel A02;
    public final boolean A03;
    public final boolean A04;

    public final void AHo(UserSession userSession) {
    }

    public final Integer AJJ(UserSession userSession, C324596za r12, C324356z9 r13) {
        C324356z9 r3 = r13;
        boolean A06 = 182.A06(DbS.A0J(r13, 1), userSession, 36316138921070590L);
        String str = this.A02.A02;
        long j = A05;
        C324596za r4 = r12;
        if (A06) {
            return r3.A02(r4, str, j, false, true);
        }
        return r3.A01(r4, str, j, false);
    }

    public final void AQ0(Context context, UserSession userSession, String str, String str2, boolean z, boolean z2) {
        ILD ild = new ILD(this, 1);
        0Tu r8 = 0Tu.A05;
        UserSession userSession2 = userSession;
        boolean A06 = 182.A06(r8, userSession2, 36316138921070590L);
        boolean z3 = this.A04;
        I6G i6g = I6G.A00;
        AudioPageAssetModel audioPageAssetModel = this.A02;
        if (A06) {
            MusicPageTabType musicPageTabType = this.A01;
            MusicPageTabType musicPageTabType2 = musicPageTabType;
            AudioPageAssetModel audioPageAssetModel2 = audioPageAssetModel;
            1GP A052 = i6g.A05(musicPageTabType2, audioPageAssetModel2, userSession2, (String) null, true, true, 182.A06(r8, userSession2, 36316138921201664L), false);
            1Ga A002 = 1GZ.A00(userSession2);
            String str3 = audioPageAssetModel.A02;
            0qQ.A0B(str3, 0);
            1GP r13 = null;
            long j = A05;
            if (z3) {
                1FZ r2 = new 1FZ(userSession2, 27647154, 1, false);
                r2.A04();
                r2.A0A("clips/music/");
                r2.A07(AnonymousClass05K.A0C);
                r2.A0A = str3;
                r2.A00 = C51973G9u.A0d(userSession2, GVS.class, false, true);
                I6G.A01(r2, musicPageTabType, audioPageAssetModel, (String) null);
                r13 = r2.A0M();
            }
            1Ga.A00(A002, ild, (AnonymousClass1GR) null, (AnonymousClass1GR) null, A052, r13, str3, j, false, false);
            return;
        }
        MusicPageTabType musicPageTabType3 = this.A01;
        1OC A032 = i6g.A03(musicPageTabType3, audioPageAssetModel, userSession2, (String) null, true, true);
        1P2 A003 = 1P1.A00(userSession2);
        String str4 = audioPageAssetModel.A02;
        0qQ.A0B(str4, 0);
        1OC r132 = null;
        long j2 = A05;
        if (z3) {
            1NY A0a = AnonymousClass7TG.A0a(userSession2);
            A0a.A0A("clips/music/");
            A0a.A07(AnonymousClass05K.A0C);
            A0a.A0A = str4;
            C51972G9s.A18(A0a, userSession2, GVS.class);
            I6G.A01(A0a, musicPageTabType3, audioPageAssetModel, (String) null);
            r132 = A0a.A0M();
        }
        1P2.A00(A003, ild, (1P0) null, (1P0) null, A032, r132, str4, j2, false, false);
    }

    public final boolean ARQ(UserSession userSession) {
        return false;
    }

    public final 1Xj B65(UserSession userSession) {
        return null;
    }

    public final 1OC BCc(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        I6G i6g = I6G.A00;
        AudioPageAssetModel audioPageAssetModel = this.A02;
        return i6g.A03(this.A01, audioPageAssetModel, userSession, (String) null, z, false);
    }

    public final Integer Bec(UserSession userSession) {
        if (182.A06(DbS.A0J(userSession, 0), userSession, 36316138921070590L)) {
            return 1GZ.A00(userSession).A06(this.A02.A02, A05, false);
        }
        return 1P1.A00(userSession).A06(this.A02.A02, A05, false);
    }

    public final 1OC C42(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        I6G i6g = I6G.A00;
        AudioPageAssetModel audioPageAssetModel = this.A02;
        return i6g.A03(this.A01, audioPageAssetModel, userSession, str, false, false);
    }

    public final 1GP Cmt(Context context, UserSession userSession, Long l, String str, List list, boolean z, boolean z2, boolean z3) {
        UserSession userSession2 = userSession;
        AnonymousClass7TF.A1C(userSession, 0, list);
        if (!A00(userSession)) {
            return null;
        }
        return I6G.A00.A05(this.A01, this.A02, userSession2, (String) null, z, false, 182.A06(0Tu.A05, userSession, 36316138921201664L), true);
    }

    public final 1GP Cmv(Context context, UserSession userSession, String str, List list, boolean z) {
        UserSession userSession2 = userSession;
        AnonymousClass7TF.A1C(userSession, 0, list);
        if (!A00(userSession)) {
            return null;
        }
        return I6G.A00.A05(this.A01, this.A02, userSession2, str, false, false, 182.A06(0Tu.A05, userSession, 36316138921201664L), false);
    }

    public final /* synthetic */ void Cn2(UserSession userSession, String str) {
    }

    public final /* synthetic */ void ES0(GEP gep) {
    }

    public final /* synthetic */ void ESn(Context context) {
    }

    public final /* synthetic */ void EiB(String str) {
    }

    public final /* synthetic */ void Elk(C290515fR r1) {
    }

    private final boolean A00(UserSession userSession) {
        if (this.A01 == MusicPageTabType.PHOTOS) {
            return false;
        }
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36316138921005053L) || 182.A06(r2, userSession, 36316138921201664L)) {
            return true;
        }
        return false;
    }

    public C57035IMb(MusicPageTabType musicPageTabType, AudioPageAssetModel audioPageAssetModel, int i, boolean z, boolean z2) {
        this.A02 = audioPageAssetModel;
        this.A00 = i;
        this.A01 = musicPageTabType;
        this.A04 = z;
        this.A03 = z2;
    }

    public final String Beh() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ boolean CTp(boolean z) {
        return false;
    }
}
