package X;

import android.content.Context;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.OFy  reason: case insensitive filesystem */
public final class C70677OFy {
    public int A00 = 2;
    public final Context A01;
    public final C60061Jec A02;
    public final List A03;
    public final 0sL A04;

    public C70677OFy(Context context, C60061Jec jec, 0sL r17) {
        this.A01 = context;
        this.A02 = jec;
        this.A04 = r17;
        N4H n4h = new N4H(C69286Nim.RECENT, AnonymousClass05K.A00, "", R.drawable.instagram_clock_pano_outline_16, 2131959404);
        N4H n4h2 = new N4H(C69286Nim.SAVED, AnonymousClass05K.A01, "", R.drawable.instagram_star_pano_outline_16, 2131959400);
        C69286Nim nim = C69286Nim.SEARCH;
        this.A03 = 0sr.A1P(new N4H[]{n4h, n4h2, new N4H(nim, AnonymousClass05K.A0C, "", R.drawable.instagram_promote_pano_filled_16, 2131959403), new N4H(nim, AnonymousClass05K.A0N, "laugh", R.drawable.instagram_face1_pano_outline_16, 2131959401), new N4H(nim, AnonymousClass05K.A0Y, "love", R.drawable.instagram_heart_pano_outline_16, 2131959402), new N4H(nim, AnonymousClass05K.A0j, "sad", R.drawable.instagram_face4_pano_outline_16, 2131959405), new N4H(nim, AnonymousClass05K.A15, "thumbs up", R.drawable.instagram_thumb_up_pano_outline_16, 2131959406), new N4H(nim, AnonymousClass05K.A0u, C273654mx.A00(248), R.drawable.instagram_party_popper_pano_outline_16, 2131959399)});
    }
}
