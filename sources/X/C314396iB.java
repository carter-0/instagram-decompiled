package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.facebook.cameracore.mediapipeline.services.music.MusicItem;
import com.facebook.cameracore.mediapipeline.services.music.MusicServiceDataSource;
import com.facebook.native_bridge.NativeDataPromise;

/* renamed from: X.6iB  reason: invalid class name and case insensitive filesystem */
public final class C314396iB implements MusicServiceDataSource {
    public static final String[] A0E = {"com.android.music.metachanged", "com.android.music.playstatechanged", "com.android.music.updateprogress", "com.htc.music.metachanged", "com.htc.music.playstatechanged", "fm.last.android.metachanged", "fm.last.android.playstatechanged", "com.amazon.mp3.metachanged", "com.amazon.mp3.playstatechanged", "com.real.IMP.metachanged", "com.real.IMP.playstatechanged", "com.sonyericsson.music.metachanged", "com.sonyericsson.music.playstatechanged", "com.spotify.music.metadatachanged", "com.spotify.music.playbackstatechanged", "com.samsung.sec.android.MusicPlayer.playstatechanged", "com.samsung.sec.android.MusicPlayer.metachanged"};
    public int A00 = -1;
    public MusicItem A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public NativeDataPromise A06;
    public NativeDataPromise A07;
    public NativeDataPromise A08;
    public NativeDataPromise A09;
    public NativeDataPromise A0A;
    public final BroadcastReceiver A0B;
    public final Context A0C;
    public final IntentFilter A0D;

    public static void A00(C314396iB r4) {
        NativeDataPromise nativeDataPromise;
        NativeDataPromise nativeDataPromise2;
        NativeDataPromise nativeDataPromise3;
        NativeDataPromise nativeDataPromise4;
        NativeDataPromise nativeDataPromise5;
        if (!r4.A05) {
            r4.A05 = true;
            0DH.A03(r4.A0B, r4.A0C, r4.A0D, true);
        }
        String str = r4.A04;
        if (!(str == null || (nativeDataPromise5 = r4.A0A) == null)) {
            nativeDataPromise5.setValue(str);
            r4.A0A = null;
        }
        String str2 = r4.A02;
        if (!(str2 == null || (nativeDataPromise4 = r4.A07) == null)) {
            nativeDataPromise4.setValue(str2);
            r4.A07 = null;
        }
        String str3 = r4.A03;
        if (!(str3 == null || (nativeDataPromise3 = r4.A08) == null)) {
            nativeDataPromise3.setValue(str3);
            r4.A08 = null;
        }
        int i = r4.A00;
        if (!(i == -1 || (nativeDataPromise2 = r4.A09) == null)) {
            nativeDataPromise2.setValue(Integer.valueOf(i));
            r4.A09 = null;
        }
        MusicItem musicItem = r4.A01;
        if (musicItem != null && (nativeDataPromise = r4.A06) != null) {
            nativeDataPromise.setValue(musicItem);
            r4.A06 = null;
        }
    }

    public final void getCurrentPlayingItem(NativeDataPromise nativeDataPromise) {
        this.A06 = nativeDataPromise;
        A00(this);
    }

    public final void getCurrentSongArtist(NativeDataPromise nativeDataPromise) {
        this.A07 = nativeDataPromise;
        A00(this);
    }

    public final void getCurrentSongGenre(NativeDataPromise nativeDataPromise) {
        this.A08 = nativeDataPromise;
        A00(this);
    }

    public final void getCurrentSongPlaybackTimeMs(NativeDataPromise nativeDataPromise) {
        this.A09 = nativeDataPromise;
        A00(this);
    }

    public final void getCurrentSongTitle(NativeDataPromise nativeDataPromise) {
        this.A0A = nativeDataPromise;
        A00(this);
    }

    public final void stop() {
        if (this.A05) {
            this.A0C.unregisterReceiver(this.A0B);
        }
        this.A05 = false;
    }

    public C314396iB(Context context) {
        this.A0C = context;
        this.A0D = new IntentFilter();
        String[] strArr = A0E;
        int i = 0;
        do {
            this.A0D.addAction(strArr[i]);
            i++;
        } while (i < 17);
        this.A0B = new C314406iD(this);
    }
}
