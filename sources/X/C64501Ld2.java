package X;

import android.content.Context;
import android.graphics.RectF;
import androidx.fragment.app.Fragment;
import com.instagram.archive.fragment.InlineAddHighlightFragment;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.Ld2  reason: case insensitive filesystem */
public final class C64501Ld2 implements C66521MUz {
    public final Context A00;
    public final 1Ng A01;
    public final UserSession A02;
    public final 1Xj A03;
    public final ImageUrl A04;
    public final AnonymousClass3BQ A05;
    public final String A06;

    public final void D6m(InlineAddHighlightFragment inlineAddHighlightFragment, AnonymousClass4D6 r20, String str) {
        ImageUrl imageUrl = this.A04;
        RectF A08 = JW0.A08(JW0.A01(imageUrl.getWidth(), imageUrl.getHeight()), imageUrl.getWidth(), imageUrl.getHeight());
        UserSession userSession = this.A02;
        Ki3 A022 = JZV.A02(this.A05);
        String str2 = this.A06;
        HashSet hashSet = new HashSet(Collections.singletonList(str2));
        int height = imageUrl.getHeight();
        int width = imageUrl.getWidth();
        List asList = Arrays.asList(new Float[]{Float.valueOf(A08.left), Float.valueOf(A08.top), Float.valueOf(A08.right), Float.valueOf(A08.bottom)});
        0qQ.A0B(userSession, 0);
        String str3 = str;
        0qQ.A0B(str3, 3);
        1OC A002 = AnonymousClass738.A00(A022, userSession, str3, str2, (String) null, (String) null, asList, hashSet, height, width, false);
        A002.A00 = new KAK(this, inlineAddHighlightFragment);
        r20.schedule(A002);
    }

    public final void DOL(C322126vI r3, List list) {
        MRU lcu;
        1Xj r0 = this.A03;
        if (r0 != null) {
            lcu = new C64492Lct(r0);
        } else {
            lcu = new C64493Lcu(this.A06);
        }
        C322126vI.A01(lcu, r3, list, MNY.A00);
    }

    public C64501Ld2(Context context, UserSession userSession, ImageUrl imageUrl, 1Xj r5, AnonymousClass3BQ r6, String str) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = AnonymousClass1Nd.A00(userSession);
        this.A03 = r5;
        this.A06 = str;
        this.A04 = imageUrl;
        this.A05 = r6;
    }

    public final void A00(ImageUrl imageUrl, String str) {
        2MD A012 = 2MD.A01();
        OIS A002 = OU0.A00(this.A02.A06);
        A002.A0G = AnonymousClass000.A00(297);
        A002.A04 = imageUrl;
        A002.A0H = str;
        A002.A03 = PushChannelType.LOCAL;
        A002.A08 = new C65352Lrs(this, 0);
        JTT.A1O(A002, A012);
    }

    public final void DcI(Fragment fragment, AnonymousClass4D6 r16, String str, boolean z) {
        List A052;
        int height;
        int width;
        HashSet A1F = AnonymousClass7TE.A1F();
        HashSet A1F2 = AnonymousClass7TE.A1F();
        String str2 = this.A06;
        C51970G9q.A1Q(str2, A1F2, A1F, z ? 1 : 0);
        UserSession userSession = this.A02;
        String str3 = str;
        Reel A0L = Dba.A0L(userSession, str3);
        String str4 = null;
        if (A0L == null) {
            0wb.A03("HighlightFromActiveStoryDelegate", "No currentReel found for onReelItemClick");
        } else {
            C63830L8l A002 = JZV.A00(fragment.requireContext(), userSession, A0L, str2);
            if (A002 != null) {
                str4 = A002.A03;
                A052 = JZV.A05(A002);
                ImageUrl imageUrl = A002.A02;
                height = imageUrl.getHeight();
                width = imageUrl.getWidth();
                Ki3 A022 = JZV.A02(this.A05);
                AnonymousClass7TG.A1N(userSession, str3);
                1OC A012 = AnonymousClass738.A01(A022, userSession, str3, (String) null, str4, (String) null, A052, A1F, A1F2, height, width);
                A012.A00 = new KAU(fragment, this, A0L, !z);
                r16.schedule(A012);
            }
        }
        A052 = null;
        height = 0;
        width = 0;
        Ki3 A0222 = JZV.A02(this.A05);
        AnonymousClass7TG.A1N(userSession, str3);
        1OC A0122 = AnonymousClass738.A01(A0222, userSession, str3, (String) null, str4, (String) null, A052, A1F, A1F2, height, width);
        A0122.A00 = new KAU(fragment, this, A0L, !z);
        r16.schedule(A0122);
    }

    public final ImageUrl Arz(Context context) {
        return this.A04;
    }
}
