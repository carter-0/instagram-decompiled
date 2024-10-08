package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.music.common.model.MusicBrowseCategory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.JjX  reason: case insensitive filesystem */
public abstract class C60328JjX extends 2YL implements C66542MVw {
    public final ImmutableList A00;
    public final MusicProduct A01;
    public final AnonymousClass4DH A02;
    public final UserSession A03;
    public final JZH A04;
    public final AnonymousClass0r6 A05;
    public final AnonymousClass0r6 A06;
    public final 05G A07;
    public final 05G A08;

    public final 1OC ANA(1NU r12, Integer num, Long l, Object obj, String str) {
        0qQ.A0B(num, 1);
        LSH lsh = LSH.A02;
        UserSession userSession = this.A03;
        MusicBrowseCategory A002 = A00();
        return lsh.A02(this.A01, userSession, r12, A002, num, l, str, (String) null, (String) null, (Map) null);
    }

    public final Object BnI() {
        return null;
    }

    public final boolean CKd() {
        return false;
    }

    public final /* synthetic */ void DTq(String str, Object obj, int i) {
    }

    public final /* synthetic */ void DTr(int i, Object obj, boolean z) {
    }

    public final void DeV(Object obj, int i) {
    }

    public final void Del(Object obj, int i) {
    }

    public final boolean Et6() {
        return false;
    }

    public final boolean EtB() {
        return false;
    }

    public final MusicBrowseCategory A00() {
        String str;
        String str2;
        if (this instanceof KVO) {
            if (!this.A00.contains(AudioTrackType.ORIGINAL)) {
                str2 = "playlists";
            } else {
                str2 = "saved_music";
            }
            return C64181LSn.A03(str2, "bookmarked", "");
        }
        MusicProduct musicProduct = this.A01;
        if (musicProduct == MusicProduct.CLIPS_CAMERA_FORMAT_V2) {
            str = "clips_browse";
        } else if (C14245TsS.A02(musicProduct)) {
            str = "stories_browse";
        } else if (musicProduct == MusicProduct.MUSIC_IN_FEED) {
            str = "feed_browse";
        } else if (musicProduct == MusicProduct.MUSIC_NOTES) {
            str = "notes_browse";
        } else {
            str = "trending";
        }
        return C64181LSn.A01(str);
    }

    public final C62550Khg A01() {
        if (this instanceof KVO) {
            return ((KVO) this).A00;
        }
        return ((KVP) this).A02;
    }

    public final void A02() {
        Object obj;
        if (this instanceof KVO) {
            KVO kvo = (KVO) this;
            05G r5 = kvo.A07;
            ArrayList A0U = 00k.A0U(JTO.A13(r5));
            C60329JjY jjY = kvo.A01;
            Set<C66569MWx> set = jjY.A05;
            for (C66569MWx mWx : set) {
                Iterator A1H = C51966G9m.A1H(r5.getValue());
                while (true) {
                    obj = null;
                    if (!A1H.hasNext()) {
                        break;
                    }
                    Object next = A1H.next();
                    L25 l25 = (L25) next;
                    if (l25 instanceof KV3) {
                        C66569MWx A002 = ((KV3) l25).A00.A00();
                        if (A002 != null) {
                            obj = A002.getId();
                        }
                        if (0qQ.A0K(obj, mWx.getId())) {
                            obj = next;
                            break;
                        }
                    }
                }
                Object A022 = jjY.A00(mWx).A02();
                if (obj != null) {
                    if (AnonymousClass7TF.A1Y(A022, false)) {
                        A0U.remove(obj);
                    } else {
                        A0U.remove(obj);
                    }
                } else if (DbX.A1a(A022)) {
                    0qQ.A0B(mWx, 0);
                    obj = LJU.A00(new JZC(LQp.A00(mWx)));
                    if (obj == null) {
                    }
                }
                A0U.add(0, obj);
            }
            do {
            } while (!JTP.A1b(A0U, r5));
            set.clear();
        }
    }

    public final void DeK(C268654dm r3, int i) {
        this.A08.Epw(C62514Kh4.FAILED);
    }

    public C60328JjX(ImmutableList immutableList, MusicProduct musicProduct, AnonymousClass4DH r7, UserSession userSession) {
        this.A02 = r7;
        this.A03 = userSession;
        this.A01 = musicProduct;
        this.A00 = immutableList;
        02z A10 = DbS.A10(C62514Kh4.UNINITIALIZED);
        this.A08 = A10;
        this.A06 = A10;
        02z A1J = JTO.A1J();
        this.A07 = A1J;
        this.A05 = A1J;
        this.A04 = new JZH(r7, userSession, A00(), this, false);
    }

    public final void Dew(C66446MSa mSa, Object obj, int i, boolean z, boolean z2) {
        KV3 A002;
        Object value;
        ArrayList A0S;
        ArrayList A012 = C64131LPf.A01(mSa.F04().A05, this.A00);
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.addAll(LJU.A01(A012));
        if (this instanceof KVO) {
            A02();
        } else {
            KVP kvp = (KVP) this;
            if (kvp.A01 == MusicProduct.CLIPS_CAMERA_FORMAT_V2) {
                ImmutableList immutableList = kvp.A01;
                if (!immutableList.isEmpty() && kvp.A00 == C3515589i.POST_CAPTURE_AUDIO_BUTTON && AnonymousClass8IK.A07(kvp.A03) && (A002 = LJU.A00(JZC.A0J.A02(kvp.A02.requireContext(), immutableList))) != null) {
                    A1C.add(00k.A0J(A1C) instanceof KV0 ? 1 : 0, A002);
                }
            }
        }
        05G r2 = this.A07;
        do {
            value = r2.getValue();
            Collection collection = (Collection) value;
            if (z) {
                A0S = A1C;
            } else {
                A0S = 00k.A0S(A1C, collection);
            }
        } while (!r2.AIY(value, A0S));
        this.A08.Epw(C62514Kh4.LOADED);
    }
}
