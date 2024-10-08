package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class ECH extends 1P0 {
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;
    public final AnonymousClass8HT A03;
    public final AnonymousClass6ST A04;
    public final String A05;
    public final 0sP A06;
    public final boolean A07;

    public ECH(Context context, Fragment fragment, UserSession userSession, AnonymousClass8HT r5, AnonymousClass6ST r6, String str, 0sP r8, boolean z) {
        AnonymousClass7TF.A1E(r6, 6, r5);
        this.A00 = context;
        this.A02 = userSession;
        this.A05 = str;
        this.A01 = fragment;
        this.A04 = r6;
        this.A03 = r5;
        this.A07 = z;
        this.A06 = r8;
    }

    public final void onFail(C268654dm r4) {
        int A032 = AnonymousClass0fD.A03(2055370590);
        this.A03.A02(C273654mx.A00(3008));
        0KC.A0C(this.A05, "Could not get the media file with the reel Id");
        AnonymousClass0fD.A0A(-1139318256, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list;
        int A032 = AnonymousClass0fD.A03(-370039757);
        C324576zY r13 = (C324576zY) obj;
        int A033 = AnonymousClass0fD.A03(-191423568);
        0qQ.A0B(r13, 0);
        AnonymousClass3HX A002 = r13.A00();
        if (A002 == null || (list = A002.A1j) == null || list.isEmpty()) {
            this.A03.A02("media_fetch_returned_no_story_media");
            C59689JTv.A01(this.A00, "story_mentions_not_available_error_message", 2131974454, 0);
        } else {
            Context context = this.A00;
            UserSession userSession = this.A02;
            1Xj r2 = (1Xj) list.get(0);
            String str = this.A05;
            boolean z = this.A07;
            Fragment fragment = this.A01;
            AnonymousClass6ST r10 = this.A04;
            AnonymousClass8HT r9 = this.A03;
            0sP r11 = this.A06;
            if (r2 == null) {
                r9.A02("missing_story_media_for_media_save");
            } else {
                C290815g0 A034 = C59730JVo.A03(context, userSession, C59730JVo.A05(context, r2, str, false, z));
                A034.A00 = new EHT(context, fragment, r9, r10, r11);
                1ES.A03(A034);
            }
        }
        AnonymousClass0fD.A0A(-947081083, A033);
        AnonymousClass0fD.A0A(-1551632957, A032);
    }
}
