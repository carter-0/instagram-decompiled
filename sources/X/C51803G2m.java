package X;

import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.clips.audio.trending.repository.TrendingAudioPagingSource;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.G2m  reason: case insensitive filesystem */
public final class C51803G2m extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51803G2m(C64831Lis lis, String str, String str2, int i) {
        super(0);
        this.A00 = i;
        this.A01 = lis;
        if (15 - i != 0) {
            this.A03 = str;
            this.A02 = str2;
        } else {
            this.A02 = str;
            this.A03 = str2;
        }
    }

    public static IllegalStateException A00(C51803G2m g2m) {
        return new IllegalStateException(002.A0R("Argument not found for ", g2m.A03));
    }

    public final Object invoke() {
        switch (this.A00) {
            case 0:
                Object A0k = DbU.A0k(0eO.A02, new C51690Fyq((Fragment) this.A01, this.A02));
                if (A0k != null) {
                    return A0k;
                }
                throw A00(this);
            case 1:
                Object A0k2 = DbU.A0k(0eO.A02, new C51691Fyr((Fragment) this.A01, this.A02));
                if (A0k2 != null) {
                    return A0k2;
                }
                throw A00(this);
            case 2:
                Object A0k3 = DbU.A0k(0eO.A02, new C51692Fys((Fragment) this.A01, this.A02));
                if (A0k3 != null) {
                    return A0k3;
                }
                throw A00(this);
            case 3:
                Object A0k4 = DbU.A0k(0eO.A02, new C51693Fyt((Fragment) this.A01, this.A02));
                if (A0k4 != null) {
                    return A0k4;
                }
                throw A00(this);
            case 4:
                Object A0k5 = DbU.A0k(0eO.A02, new C51694Fyu((Fragment) this.A01, this.A02));
                if (A0k5 != null) {
                    return A0k5;
                }
                throw A00(this);
            case 5:
                Object A0k6 = DbU.A0k(0eO.A02, new C51695Fyv((Fragment) this.A01, this.A02));
                if (A0k6 != null) {
                    return A0k6;
                }
                throw A00(this);
            case 6:
                Object A0k7 = DbU.A0k(0eO.A02, new C51696Fyw((Fragment) this.A01, this.A02));
                if (A0k7 != null) {
                    return A0k7;
                }
                throw A00(this);
            case 7:
                Object A0k8 = DbU.A0k(0eO.A02, new C51697Fyx((Fragment) this.A01, this.A02));
                if (A0k8 != null) {
                    return A0k8;
                }
                throw A00(this);
            case 8:
                Object A0k9 = DbU.A0k(0eO.A02, new C51698Fyy((Fragment) this.A01, this.A02));
                if (A0k9 != null) {
                    return A0k9;
                }
                throw A00(this);
            case 9:
                Object A0k10 = DbU.A0k(0eO.A02, new C51699Fyz((Fragment) this.A01, this.A02));
                if (A0k10 != null) {
                    return A0k10;
                }
                throw A00(this);
            case 10:
                Object A0k11 = DbU.A0k(0eO.A02, new C51700Fz0((Fragment) this.A01, this.A02));
                if (A0k11 != null) {
                    return A0k11;
                }
                throw A00(this);
            case 11:
                Object A0k12 = DbU.A0k(0eO.A02, new C51701Fz1((Fragment) this.A01, this.A02));
                if (A0k12 != null) {
                    return A0k12;
                }
                throw A00(this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                Object A0k13 = DbU.A0k(0eO.A02, new C51702Fz2((Fragment) this.A01, this.A02));
                if (A0k13 != null) {
                    return A0k13;
                }
                throw A00(this);
            case 13:
                Object A0k14 = DbU.A0k(0eO.A02, new Fz3((Fragment) this.A01, this.A02));
                if (A0k14 != null) {
                    return A0k14;
                }
                throw A00(this);
            case 14:
                Object A0k15 = DbU.A0k(0eO.A02, new C51703Fz4((Fragment) this.A01, this.A02));
                if (A0k15 != null) {
                    return A0k15;
                }
                throw A00(this);
            case 15:
                C64831Lis lis = (C64831Lis) this.A01;
                ((UserFlowLoggerImpl) lis.A02.getValue()).flowAnnotate(lis.A00, this.A02, this.A03);
                break;
            case 16:
                C64831Lis lis2 = (C64831Lis) this.A01;
                ((UserFlowLoggerImpl) lis2.A02.getValue()).flowMarkPoint(lis2.A00, this.A03, this.A02);
                break;
            case 17:
                Object A0k16 = DbU.A0k(0eO.A02, new C51704Fz5((Fragment) this.A01, this.A02));
                if (A0k16 != null) {
                    return A0k16;
                }
                throw A00(this);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                Object A0k17 = DbU.A0k(0eO.A02, new C51706Fz7((Fragment) this.A01, this.A02));
                if (A0k17 != null) {
                    return A0k17;
                }
                throw A00(this);
            case 19:
                Object A0k18 = DbU.A0k(0eO.A02, new C51707Fz8((Fragment) this.A01, this.A02));
                if (A0k18 != null) {
                    return A0k18;
                }
                throw A00(this);
            case 20:
            case 21:
                ((C299635va) this.A01).CqE(this.A02, this.A03);
                break;
            case 22:
                ((C299665vd) this.A01).DBO(this.A03, this.A02);
                break;
            case 23:
                C54429HDb hDb = (C54429HDb) this.A01;
                return new TrendingAudioPagingSource(hDb.A00, hDb.A01, this.A03, this.A02, DbX.A07(hDb.A02));
            case 25:
                Object A0k19 = DbU.A0k(0eO.A02, new C51708Fz9((Fragment) this.A01, this.A02));
                if (A0k19 != null) {
                    return A0k19;
                }
                throw A00(this);
            case 26:
                Object A0k20 = DbU.A0k(0eO.A02, new C51709FzA((Fragment) this.A01, this.A02));
                if (A0k20 != null) {
                    return A0k20;
                }
                throw A00(this);
            case 27:
                Object A0k21 = DbU.A0k(0eO.A02, new C51710FzB((Fragment) this.A01, this.A02));
                if (A0k21 != null) {
                    return A0k21;
                }
                throw A00(this);
            case 28:
                Object A0k22 = DbU.A0k(0eO.A02, new C51711FzC((Fragment) this.A01, this.A02));
                if (A0k22 != null) {
                    return A0k22;
                }
                throw A00(this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                Object A0k23 = DbU.A0k(0eO.A02, new C51712FzD((Fragment) this.A01, this.A02));
                if (A0k23 != null) {
                    return A0k23;
                }
                throw A00(this);
            case 30:
                Object A0k24 = DbU.A0k(0eO.A02, new C51717FzI((Fragment) this.A01, this.A02));
                if (A0k24 != null) {
                    return A0k24;
                }
                throw A00(this);
            case 32:
                Object A0k25 = DbU.A0k(0eO.A02, new C51719FzK((Fragment) this.A01, this.A02));
                if (A0k25 != null) {
                    return A0k25;
                }
                throw A00(this);
            case 33:
                Object A0k26 = DbU.A0k(0eO.A02, new C51720FzL((Fragment) this.A01, this.A02));
                if (A0k26 != null) {
                    return A0k26;
                }
                throw A00(this);
            case 34:
                Object A0k27 = DbU.A0k(0eO.A02, new C51721FzM((Fragment) this.A01, this.A02));
                if (A0k27 != null) {
                    return A0k27;
                }
                throw A00(this);
            case 35:
                Object A0k28 = DbU.A0k(0eO.A02, new C51722FzN((Fragment) this.A01, this.A02));
                if (A0k28 != null) {
                    return A0k28;
                }
                throw A00(this);
            case 36:
                Object A0k29 = DbU.A0k(0eO.A02, new C51724FzP((Fragment) this.A01, this.A02));
                if (A0k29 != null) {
                    return A0k29;
                }
                throw A00(this);
            case 37:
                Object A0k30 = DbU.A0k(0eO.A02, new C51725FzQ((Fragment) this.A01, this.A02));
                if (A0k30 != null) {
                    return A0k30;
                }
                throw A00(this);
            case 38:
                Object A0k31 = DbU.A0k(0eO.A02, new C51726FzR((Fragment) this.A01, this.A02));
                if (A0k31 != null) {
                    return A0k31;
                }
                throw A00(this);
            case 39:
                Object A0k32 = DbU.A0k(0eO.A02, new C51727FzS((Fragment) this.A01, this.A02));
                if (A0k32 != null) {
                    return A0k32;
                }
                throw A00(this);
            case 40:
                Object A0k33 = DbU.A0k(0eO.A02, new C51728FzT((Fragment) this.A01, this.A02));
                if (A0k33 != null) {
                    return A0k33;
                }
                throw A00(this);
            case Seq.NULL_REFNUM:
                Object A0k34 = DbU.A0k(0eO.A02, new C51732FzX((Fragment) this.A01, this.A02));
                if (A0k34 != null) {
                    return A0k34;
                }
                throw A00(this);
            case Seq.RefTracker.REF_OFFSET:
                Object A0k35 = DbU.A0k(0eO.A02, new C51733FzY((Fragment) this.A01, this.A02));
                if (A0k35 != null) {
                    return A0k35;
                }
                throw A00(this);
            case 43:
                Object A0k36 = DbU.A0k(0eO.A02, new C51734FzZ((Fragment) this.A01, this.A02));
                if (A0k36 != null) {
                    return A0k36;
                }
                throw A00(this);
            case 44:
                Object A0k37 = DbU.A0k(0eO.A02, new C51735Fza((Fragment) this.A01, this.A02));
                if (A0k37 != null) {
                    return A0k37;
                }
                throw A00(this);
            case 45:
                Object A0k38 = DbU.A0k(0eO.A02, new C51736Fzb((Fragment) this.A01, this.A02));
                if (A0k38 != null) {
                    return A0k38;
                }
                throw A00(this);
            case 46:
                Object A0k39 = DbU.A0k(0eO.A02, new C51738Fzd((Fragment) this.A01, this.A02));
                if (A0k39 != null) {
                    return A0k39;
                }
                throw A00(this);
            case 47:
                Object A0k40 = DbU.A0k(0eO.A02, new C51739Fze((Fragment) this.A01, this.A02));
                if (A0k40 != null) {
                    return A0k40;
                }
                throw A00(this);
            case 48:
                Object A0k41 = DbU.A0k(0eO.A02, new C51740Fzf((Fragment) this.A01, this.A02));
                if (A0k41 != null) {
                    return A0k41;
                }
                throw A00(this);
            case 49:
                Object A0k42 = DbU.A0k(0eO.A02, new C51741Fzg((Fragment) this.A01, this.A02));
                if (A0k42 != null) {
                    return A0k42;
                }
                throw A00(this);
            default:
                ((0sL) this.A01).invoke(this.A02, this.A03);
                break;
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51803G2m(Object obj, String str, String str2, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = str2;
    }
}
