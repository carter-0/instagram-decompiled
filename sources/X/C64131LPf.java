package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.music.common.model.MusicSearchPlaylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LPf  reason: case insensitive filesystem */
public abstract class C64131LPf {
    public static final boolean A02(Context context, C66569MWx mWx) {
        0qQ.A0B(context, 0);
        if (!mWx.CRQ()) {
            return true;
        }
        String Axe = mWx.Axe();
        if (Axe != null) {
            C59689JTv.A09(context, Axe);
            return false;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final SpannableStringBuilder A00(Context context, List list) {
        boolean A1X = DbW.A1X(list);
        SpannableStringBuilder A0E = C51965G9l.A0E();
        if (AnonymousClass7TE.A1b(list)) {
            A0E.append(context.getString(2131967823));
            A0E.append(":");
            OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf = (OriginalAudioPartMetadataIntf) list.get(A1X ? 1 : 0);
            A0E.append(" ");
            A0E.append(originalAudioPartMetadataIntf.getDisplayArtist());
            A0E.append(" • ");
            A0E.append(originalAudioPartMetadataIntf.getDisplayTitle());
            if (originalAudioPartMetadataIntf.isExplicit()) {
                A0E.append(" ");
                Drawable drawable = context.getDrawable(R.drawable.music_explicit);
                if (drawable != null) {
                    Drawable mutate = drawable.mutate();
                    if (mutate != null) {
                        mutate.setColorFilter(DbV.A01(context), PorterDuff.Mode.SRC_IN);
                    }
                    drawable.setBounds(A1X, A1X, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    C263324Kh.A02(drawable, A0E, A0E.length(), A1X, A1X);
                }
            }
        }
        return A0E;
    }

    public static final ArrayList A01(List list, List list2) {
        DHT dht;
        AnonymousClass7TG.A1N(list, list2);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            JZC jzc = (JZC) it.next();
            MusicSearchPlaylist musicSearchPlaylist = jzc.A0E;
            Integer num = jzc.A0G;
            if (num == AnonymousClass05K.A0j && musicSearchPlaylist != null) {
                List A15 = JTO.A15(musicSearchPlaylist.A01);
                if (AnonymousClass7TE.A1b(A15)) {
                    dht = ((JZC) 00k.A0I(A15)).A0F;
                }
                A1C.add(jzc);
            } else if (num == AnonymousClass05K.A01) {
                dht = jzc.A0F;
            } else {
                if (num == AnonymousClass05K.A0u && musicSearchPlaylist == null) {
                }
                A1C.add(jzc);
            }
            if (dht != null && list2.contains(AudioTrackType.ORIGINAL)) {
            }
            A1C.add(jzc);
        }
        return A1C;
    }
}
