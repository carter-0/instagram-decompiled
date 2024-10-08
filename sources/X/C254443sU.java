package X;

import android.os.Parcelable;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagFollowStatus;
import com.instagram.tagging.model.Tag;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3sU  reason: invalid class name and case insensitive filesystem */
public abstract class C254443sU {
    public static final String A0F(1Xj r2) {
        if (!r2.A5D() || (r2 = r2.A1c(0)) != null) {
            return r2.A0C.AYt();
        }
        return null;
    }

    public static final String A0G(1Xj r3, int i) {
        1Xj A1c;
        if (!r3.A5D() || i == -1 || (A1c = r3.A1c(0)) == null) {
            return null;
        }
        return A1c.getId();
    }

    public static final RIl A01(1Xj r3) {
        MusicMuteAudioReason musicMuteAudioReason;
        C2605946h A1O;
        C2606046i A01;
        C67231sQ clipsMetadata = r3.A0C.getClipsMetadata();
        if (!((clipsMetadata == null || (A01 = C291335gz.A01(clipsMetadata)) == null || (musicMuteAudioReason = A01.BuG()) == null) && ((A1O = r3.A1O()) == null || (musicMuteAudioReason = A1O.BuG()) == null))) {
            int ordinal = musicMuteAudioReason.ordinal();
            if (ordinal == 3) {
                return RIl.ORIGINAL_AUDIO_MUTED;
            }
            if (ordinal == 4) {
                return RIl.OUTSIDE_TERRITORY;
            }
            if (ordinal == 5) {
                return RIl.SONG_NOT_AVAILABLE;
            }
            if (ordinal == 1) {
                return RIl.LABEL_GO_DARK;
            }
        }
        return null;
    }

    public static final Long A02(0jB r1) {
        String str;
        if (r1 == null || (str = (String) r1.A01(C297705sC.A01)) == null) {
            return null;
        }
        return 00y.A0n(10, str);
    }

    public static final Long A03(0jB r1) {
        String str;
        if (r1 == null || (str = (String) r1.A01(C297705sC.A03)) == null) {
            return null;
        }
        return 00y.A0n(10, str);
    }

    public static final Long A04(0jB r1, 1Xj r2) {
        String id;
        String str;
        Long A0n;
        if (r1 != null && (str = (String) r1.A01(C298085sr.A02)) != null && (A0n = 00y.A0n(10, str)) != null) {
            return A0n;
        }
        Hashtag B6n = r2.A0C.B6n();
        if (B6n == null || (id = B6n.getId()) == null) {
            return null;
        }
        return 00y.A0n(10, id);
    }

    public static final String A09(0jB r1) {
        if (r1 != null) {
            return (String) r1.A01(C297705sC.A04);
        }
        return null;
    }

    public static final String A0A(0jB r1, C232852uY r2) {
        String str;
        if (r1 != null && (str = (String) r1.A01(C271774jZ.A7x)) != null) {
            return str;
        }
        C249763kK r0 = r2.A01;
        if (r0 != null) {
            return r0.getSessionId();
        }
        return null;
    }

    public static final String A0B(0jB r1, 1Xj r2) {
        String str;
        if (r1 != null && (str = (String) r1.A01(C298085sr.A01)) != null) {
            return str;
        }
        if (r2.A0C.B6n() != null) {
            return HashtagFollowStatus.FOLLOWING.A00;
        }
        return null;
    }

    public static final String A0C(0jB r1, 1Xj r2) {
        String str;
        if (r1 != null && (str = (String) r1.A01(C298085sr.A03)) != null) {
            return str;
        }
        Hashtag B6n = r2.A0C.B6n();
        if (B6n != null) {
            return B6n.getName();
        }
        return null;
    }

    public static final long A00(1Xj r8, AnonymousClass3W1 r9) {
        1Xj r7;
        Integer num;
        if (r8.A5D()) {
            r7 = r8.A1c(r9.A03);
        } else {
            r7 = r8;
        }
        if (r7 == null) {
            0f9 AEf = 0wj.A01.AEf("Media#CarouselIndex", 817899586);
            StringBuilder sb = new StringBuilder();
            sb.append("Loading media progress: Invalid carousel index for carousel media. Index = ");
            sb.append(r9.A03);
            sb.append(", Size = ");
            List Alu = r8.A0C.Alu();
            if (Alu != null) {
                num = Integer.valueOf(Alu.size());
            } else {
                num = null;
            }
            sb.append(num);
            AEf.ABQ(DialogModule.KEY_MESSAGE, sb.toString());
            AEf.report();
        } else if (r7.CeS() && r7.A1B() > 0) {
            return (long) ((((double) r9.A05) / ((double) r7.A1B())) * 100.0d);
        } else {
            if (r7.A5p()) {
                return (long) r9.A02();
            }
        }
        return -1;
    }

    public static final Long A05(UserSession userSession, 1Xj r2) {
        if (r2.CcK()) {
            return Long.valueOf((long) C243483Yy.A00.A06(userSession, r2).size());
        }
        return null;
    }

    public static final Long A06(1Xj r0, int i) {
        if (!r0.A5D() || i == -1) {
            return null;
        }
        return Long.valueOf((long) i);
    }

    public static final Long A07(1Xj r2, int i) {
        1Xj A1c;
        if (!r2.A5D() || i == -1 || (A1c = r2.A1c(i)) == null) {
            return null;
        }
        return Long.valueOf((long) A1c.BR7().A00);
    }

    public static final Long A08(1Xj r1, int i) {
        if (!r1.A5D() || i == -1) {
            return null;
        }
        return Long.valueOf((long) r1.A0o());
    }

    public static final String A0D(UserSession userSession, 1Xj r1) {
        User A2A = r1.A2A(userSession);
        if (A2A == null) {
            return null;
        }
        Parcelable.Creator creator = User.CREATOR;
        return 1aC.A06(A2A.B6o());
    }

    public static final String A0E(UserSession userSession, 1Xj r2, AnonymousClass4DU r3) {
        if (AnonymousClass3WX.A02(r2, r3)) {
            return C231122qu.A0F(userSession, r2);
        }
        return r2.A0C.getOrganicTrackingToken();
    }

    public static final String A0H(1Xj r2, int i) {
        1Xj A1c;
        if (!r2.A5D() || i == -1 || (A1c = r2.A1c(i)) == null) {
            return null;
        }
        return A1c.getId();
    }

    public static final String A0I(1Xj r1, int i) {
        if (!r1.A5D() || i == -1) {
            return null;
        }
        return r1.A0C.BOq();
    }

    public static final List A0J(1Xj r3) {
        Long A0n;
        ArrayList A3E = r3.A3E();
        ArrayList arrayList = null;
        if (A3E != null && (!A3E.isEmpty())) {
            arrayList = new ArrayList();
            Iterator it = A3E.iterator();
            while (it.hasNext()) {
                String id = ((Tag) it.next()).getId();
                if (!(id == null || (A0n = 00y.A0n(10, id)) == null)) {
                    arrayList.add(A0n);
                }
            }
        }
        return arrayList;
    }
}
