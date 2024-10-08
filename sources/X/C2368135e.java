package X;

import android.content.Context;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.35e  reason: invalid class name and case insensitive filesystem */
public final class C2368135e {
    public final Fragment A00;
    public final UserSession A01;

    public final void A00(FragmentActivity fragmentActivity, 1Xj r18, ShareType shareType, String str) {
        String fundraiserId;
        C229382nI A012;
        HashMap hashMap;
        HashMap hashMap2;
        Context applicationContext;
        C51897G6n fvo;
        String str2;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        0qQ.A0B(fragmentActivity2, 0);
        1Xj r3 = r18;
        0qQ.A0B(r3, 1);
        ShareType shareType2 = shareType;
        0qQ.A0B(shareType2, 2);
        String str3 = str;
        0qQ.A0B(str3, 3);
        boolean z = shareType2.A00;
        String A002 = C273654mx.A00(8);
        if (z) {
            UserSession userSession = this.A01;
            AnonymousClass4DH r1 = this.A00;
            0qQ.A0C(r1, A002);
            AnonymousClass4DH r12 = r1;
            String A2n = r3.A2n();
            if (A2n != null) {
                0qQ.A0B(r12, 2);
                A012 = C229382nI.A01((SparseArray) null, fragmentActivity2, r12, userSession);
                hashMap = new HashMap();
                hashMap2 = new HashMap();
                BitSet bitSet = new BitSet(3);
                hashMap.put(AnonymousClass000.A00(795), Long.valueOf(Long.parseLong(A2n)));
                bitSet.set(2);
                hashMap.put("source_name", "STORY");
                bitSet.set(1);
                hashMap.put(MYP.A00(), str3);
                bitSet.set(0);
                applicationContext = fragmentActivity2.getApplicationContext();
                fvo = new FVP();
                if (bitSet.nextClearBit(0) >= 3) {
                    str2 = "com.bloks.www.ig.giving.fundraiser.story.media.creation_outro.entrypoint";
                } else {
                    throw new IllegalStateException("Missing Required Props");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            C65231bS B8b = r3.A0C.B8b();
            if (B8b != null && (fundraiserId = B8b.getFundraiserId()) != null) {
                UserSession userSession2 = this.A01;
                AnonymousClass4DH r13 = this.A00;
                0qQ.A0C(r13, A002);
                AnonymousClass4DH r14 = r13;
                0qQ.A0B(r14, 2);
                A012 = C229382nI.A01((SparseArray) null, fragmentActivity2, r14, userSession2);
                hashMap = new HashMap();
                hashMap2 = new HashMap();
                BitSet bitSet2 = new BitSet(4);
                hashMap.put("fundraiser_id", fundraiserId);
                bitSet2.set(0);
                hashMap.put("share_type", "story");
                bitSet2.set(2);
                hashMap.put("source_name", "FEED_COMPOSER");
                bitSet2.set(3);
                hashMap.put(MYP.A00(), str3);
                bitSet2.set(1);
                applicationContext = fragmentActivity2.getApplicationContext();
                fvo = new FVO();
                if (bitSet2.nextClearBit(0) >= 4) {
                    str2 = "com.bloks.www.ig.giving.fundraiser.creation_outro.entrypoint";
                } else {
                    throw new IllegalStateException("Missing Required Props");
                }
            } else {
                return;
            }
        }
        FBO A003 = HX9.A00(str2);
        A003.A04 = C359608dC.A01(hashMap);
        A003.A03 = hashMap2;
        A003.A02 = fvo;
        A003.A01(applicationContext, A012);
    }

    public final boolean A01(AnonymousClass3Q2 r7, ShareType shareType) {
        0qQ.A0B(shareType, 0);
        0qQ.A0B(r7, 1);
        if (0sc.A05(new ShareType[]{ShareType.CLIPS, ShareType.CLIPS_PANAVIDEO, ShareType.REEL_SHARE, ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE, ShareType.FOLLOWERS_SHARE, ShareType.POST_LIVE_IGTV}).contains(shareType) && C39598A1o.A00(r7)) {
            if (!182.A06(0Tu.A05, this.A01, 36317710879036878L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C2368135e(Fragment fragment, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = fragment;
    }
}
