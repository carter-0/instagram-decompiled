package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.Htl  reason: case insensitive filesystem */
public final class C56157Htl {
    public final Context A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final long A03;
    public final HOL A04;
    public final C320506sU A05;
    public final AnonymousClass4DU A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final Set A0A = DbS.A0y();

    public C56157Htl(Context context, FragmentActivity fragmentActivity, HOL hol, C320506sU r5, UserSession userSession, AnonymousClass4DU r7, String str, String str2, String str3, long j) {
        0qQ.A0B(userSession, 3);
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A02 = userSession;
        this.A06 = r7;
        this.A05 = r5;
        this.A08 = str;
        this.A07 = str2;
        this.A03 = j;
        this.A09 = str3;
        this.A04 = hol;
    }

    public final SpannableStringBuilder A01(OriginalAudioSubtype originalAudioSubtype, List list) {
        Drawable A002;
        SpannableStringBuilder A0E = C51965G9l.A0E();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf = (OriginalAudioPartMetadataIntf) it.next();
            if (i > 0) {
                int length = A0E.length();
                Context context = this.A00;
                A0E.append("  |  ");
                C51971G9r.A0y(A0E, new ForegroundColorSpan(context.getColor(2Yu.A08(this.A01))), length);
            }
            String displayArtist = originalAudioPartMetadataIntf.getDisplayArtist();
            String displayTitle = originalAudioPartMetadataIntf.getDisplayTitle();
            int length2 = A0E.length();
            String A0g = 002.A0g(displayArtist, " • ", displayTitle);
            0qQ.A07(A0g);
            A0E.append(A0g);
            C51971G9r.A0y(A0E, new C60018JdR(4, originalAudioSubtype, this, originalAudioPartMetadataIntf), length2);
            if (originalAudioPartMetadataIntf.isExplicit() && (A002 = A00()) != null) {
                A0E.append(" ");
                C263324Kh.A02(A002, A0E, A0E.length(), 0, 0);
            }
            i = i2;
        }
        return A0E;
    }

    public final Drawable A00() {
        Context context = this.A00;
        Drawable drawable = context.getDrawable(R.drawable.music_explicit);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            if (mutate != null) {
                mutate.setColorFilter(context.getColor(2Yu.A0B(this.A01)), PorterDuff.Mode.SRC_IN);
            }
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        return drawable;
    }

    public final void A02() {
        UserSession userSession = this.A02;
        AnonymousClass4DU r5 = this.A06;
        long j = this.A03;
        String str = this.A08;
        String str2 = this.A07;
        String str3 = this.A09;
        HOL hol = this.A04;
        C320506sU r2 = this.A05;
        C320506sU r17 = r2;
        AnonymousClass4DU r18 = r5;
        UserSession userSession2 = userSession;
        C52086GEg.A0F(hol, C54689HOu.A0X, OriginalAudioSubtype.A06, r17, r18, userSession2, str, str2, str3, 3, j, false);
        String sessionId = r2.getSessionId();
        AnonymousClass8ZN r12 = r2.A02;
        0qQ.A0B(sessionId, 1);
        H16 h16 = new H16();
        Bundle A092 = DbY.A09(userSession);
        A092.putString("ARGS_PIVOT_PAGE_SESSION_ID", sessionId);
        A092.putSerializable("ARGS_PIVOT_PAGE_ENTRY_POINT", r12);
        A092.putString("ARGS_MEDIA_ID", str);
        A092.putString("ARGS_MEDIA_AUTHOR_ID", str2);
        A092.putLong("ARGS_CONTAINER_ID", j);
        A092.putString("ARGS_MEDIA_TAP_TOKEN", str3);
        A092.putSerializable("ARGS_AUDIO_TYPE", hol);
        C331127Pr A0V = DbV.A0V(A092, h16, userSession);
        A0V.A0d = this.A01.getText(2131955508);
        A0V.A0D = R.style.igds_emphasized_label;
        A0V.A1G = true;
        A0V.A0y = true;
        DbS.A1S(A0V, false);
        A0V.A00().A03(this.A00, h16);
    }

    public final void A03(OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf, OriginalAudioSubtype originalAudioSubtype, int i, boolean z) {
        AnonymousClass8ZN r1;
        UserSession userSession = this.A02;
        AnonymousClass4DU r5 = this.A06;
        long j = this.A03;
        OriginalAudioSubtype originalAudioSubtype2 = originalAudioSubtype;
        C52086GEg.A0F(this.A04, C54689HOu.A0X, originalAudioSubtype2, this.A05, r5, userSession, this.A08, this.A07, this.A09, i, j, z);
        String A0j = AnonymousClass7TG.A0j();
        if (originalAudioSubtype2 == OriginalAudioSubtype.A04) {
            r1 = AnonymousClass8ZN.AUDIO_PAGE_MAY_INCLUDE;
        } else {
            r1 = null;
        }
        DbU.A0w(this.A01, C250563lf.A02((C54689HOu) null, r1, LT9.A02(originalAudioPartMetadataIntf), A0j), userSession, ModalActivity.class, "audio_page");
    }

    public final void A04(OriginalAudioSubtype originalAudioSubtype, int i, boolean z) {
        String str;
        if (this.A0A.add(Integer.valueOf(i))) {
            UserSession userSession = this.A02;
            AnonymousClass4DU r11 = this.A06;
            long j = this.A03;
            String str2 = this.A08;
            String str3 = this.A07;
            String str4 = this.A09;
            HOL hol = this.A04;
            C320506sU r6 = this.A05;
            C54689HOu hOu = C54689HOu.A0X;
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r11, userSession), "instagram_organic_audio_page_audio_mix_song_impression");
            if (A0e.isSampled()) {
                DbW.A16(A0e, r11);
                C51970G9q.A1A(A0e, j);
                if (str4 == null) {
                    str4 = "";
                }
                C51965G9l.A1N(A0e, str4);
                String str5 = null;
                C51965G9l.A1E(A0e, C51972G9s.A0j(str2));
                C51965G9l.A1H(A0e, C51972G9s.A0j(str3));
                A0e.A8M(hol, "audio_type");
                A0e.AAJ("audio_sub_type", "mix");
                C51973G9u.A11(A0e, r6);
                C51965G9l.A1C(hOu, A0e);
                A0e.A9F("audio_mix_position", DbS.A0j(i));
                if (z) {
                    str5 = "MULTI_TRACKS_OVERFLOW_SHEET";
                }
                A0e.AAJ("overflow_sheet", str5);
                int ordinal = originalAudioSubtype.ordinal();
                if (ordinal == 3) {
                    str = "multitrack";
                } else if (ordinal != 1) {
                    str = null;
                } else {
                    str = "partial_attribution";
                }
                A0e.AAJ("contained_audio_relationship", str);
                A0e.Cgf();
            }
        }
    }
}
