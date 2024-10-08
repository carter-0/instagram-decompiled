package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView;
import com.instagram.modal.ModalActivity;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicDataSource;

/* renamed from: X.OZy  reason: case insensitive filesystem */
public final class C71036OZy {
    public C234502xy A00;
    public final Context A01;
    public final Drawable A02;
    public final Drawable A03;
    public final View A04;
    public final Fragment A05;
    public final CircularProgressImageView A06;
    public final String A07;
    public final Activity A08;
    public final UserSession A09;

    public C71036OZy(Activity activity, Context context, View view, Fragment fragment, UserSession userSession, String str) {
        DbW.A1O(userSession, 1, str);
        this.A09 = userSession;
        this.A05 = fragment;
        this.A08 = activity;
        this.A01 = context;
        this.A04 = view;
        this.A07 = str;
        this.A03 = AnonymousClass3JT.A05(context, R.drawable.instagram_play_pano_filled_24, context.getColor(2Yu.A0B(context)));
        this.A02 = AnonymousClass3JT.A05(context, R.drawable.instagram_pause_pano_filled_24, context.getColor(2Yu.A0B(context)));
        Context A052 = DbT.A05(context);
        C234462xu r4 = new C234462xu(DbT.A05(context), userSession);
        this.A00 = C234472xv.A00(A052, userSession, new PG4(this), r4, str, true);
        this.A06 = (CircularProgressImageView) AnonymousClass7TE.A0b(view, R.id.music_note_progress_indicator);
    }

    public static final void A00(C71036OZy oZy, N3C n3c) {
        boolean z = n3c.A08;
        if (!z) {
            C234502xy r0 = oZy.A00;
            if (r0 != null) {
                r0.E2p();
            }
            C3018660j.A01(oZy.A09).A0B(C69506Nmo.A0a);
        } else if (z) {
            if (182.A06(0Tu.A05, oZy.A09, 36317655044724138L)) {
                oZy.A04.postDelayed(new C73085PVs(oZy), 1000);
            }
        }
    }

    public final void A02(TrackData trackData) {
        Bundle A022 = C250563lf.A02((C54689HOu) null, (AnonymousClass8ZN) null, LT9.A03(trackData, false), AnonymousClass7TF.A0b());
        0qQ.A07(A022);
        Dba.A0K(this.A08, A022, this.A09, ModalActivity.class, AnonymousClass000.A00(1123)).A0C(this.A01);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView, android.widget.ImageView, android.view.View] */
    public final void A03(TrackData trackData, String str, String str2, boolean z) {
        CharSequence charSequence;
        boolean A1Z = DbW.A1Z(trackData);
        ? r4 = this.A06;
        r4.setImageDrawable(this.A03);
        View view = this.A04;
        int A0C = AnonymousClass7TE.A0C(view.getResources());
        View A0U = JTR.A0U(r4);
        A0U.post(new C73313PaY(r4, A0C, A0U));
        r4.A02 = A1Z;
        view.setVisibility(0);
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.music_note_text);
        if (A0d != null) {
            int length = str.length();
            if (length == 0 && str2.length() == 0) {
                charSequence = "";
            } else {
                Context context = this.A01;
                SpannableStringBuilder A0C2 = DbS.A0C(DbV.A0w(context.getResources(), str, str2, 2131967783));
                int length2 = str2.length();
                A0C2.setSpan(new StyleSpan(A1Z ? 1 : 0), 0, length, 17);
                A0C2.setSpan(C66580MXl.A0E(DbV.A01(context)), A0C2.length() - length2, A0C2.length(), 17);
                charSequence = A0C2;
                if (z) {
                    Drawable drawable = context.getDrawable(R.drawable.music_explicit);
                    int A022 = C66581MXm.A02(context);
                    int A082 = C51972G9s.A08(context);
                    charSequence = A0C2;
                    if (drawable != null) {
                        drawable.setBounds(0, 0, A082, A082);
                        Drawable mutate = drawable.mutate();
                        if (mutate != null) {
                            mutate.setColorFilter(A022, PorterDuff.Mode.SRC_IN);
                        }
                        C263324Kh.A02(drawable, A0C2, length, 12, 12);
                        charSequence = A0C2;
                    }
                }
            }
            A0d.setText(charSequence);
            A0d.setSelected(A1Z);
            C71408Ok7.A00(A0d, 14, this, trackData);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView, android.widget.ImageView] */
    public static final void A01(C71036OZy oZy, N3C n3c) {
        C234502xy r1 = oZy.A00;
        if (r1 != null) {
            r1.pause();
            r1.seekTo(n3c.A01);
        }
        ? r12 = oZy.A06;
        if (r12 != 0) {
            r12.setAngle(0.0f);
            r12.setImageDrawable(oZy.A03);
        }
    }

    public final void A04(N3C n3c) {
        C234502xy r1 = this.A00;
        if (r1 == null) {
            return;
        }
        if (r1.isPlaying()) {
            r1.pause();
        } else {
            A00(this, n3c);
        }
    }

    public final void A05(N3C n3c, AnonymousClass9XK r12) {
        C234502xy r1 = this.A00;
        if (r1 != null) {
            TrackData trackData = n3c.A03;
            r1.ETw(new MusicDataSource((Uri) null, AudioType.MUSIC, trackData.getProgressiveDownloadUrl(), trackData.getDashManifest(), trackData.getAudioAssetId(), trackData.getArtistId()), new C61988KUl(0, this, n3c, r12), n3c.A07, 0, -1, -1, false, false);
        }
        C234502xy r13 = this.A00;
        if (r13 != null) {
            r13.seekTo(n3c.A01);
        }
    }
}
