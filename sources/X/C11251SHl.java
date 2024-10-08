package X;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.react.modules.intent.IntentModule;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.SHl  reason: case insensitive filesystem */
public final class C11251SHl {
    public static final Map A07 = Pxe.A0N(0);
    public static final String[] A08 = {"key", IntentModule.EXTRA_MAP_KEY_FOR_VALUE};
    public final ContentResolver A00;
    public final ContentObserver A01;
    public final Object A02 = Pxe.A0p();
    public final List A03 = AnonymousClass7TE.A1C();
    public final Uri A04;
    public final Runnable A05;
    public volatile Map A06;

    public final /* synthetic */ Map A00() {
        Map map;
        Cursor A012 = 0fM.A01(this.A00, this.A04, (String) null, (String) null, A08, (String[]) null, 919598255);
        if (A012 == null) {
            return Collections.emptyMap();
        }
        try {
            int count = A012.getCount();
            if (count == 0) {
                map = Collections.emptyMap();
            } else {
                if (count <= 256) {
                    map = Pxe.A0N(count);
                } else {
                    map = new HashMap(count, 1.0f);
                }
                while (A012.moveToNext()) {
                    map.put(A012.getString(0), A012.getString(1));
                }
            }
            return map;
        } finally {
            A012.close();
        }
    }

    public C11251SHl(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        Q6L q6l = new Q6L(this);
        this.A01 = q6l;
        contentResolver.getClass();
        this.A00 = contentResolver;
        this.A04 = uri;
        this.A05 = runnable;
        contentResolver.registerContentObserver(uri, false, q6l);
    }
}
