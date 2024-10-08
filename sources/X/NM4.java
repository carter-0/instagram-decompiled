package X;

import com.instagram.music.profile.musiconprofile.MusicOnProfileProvider;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class NM4 extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    public NM4(Object obj, Object obj2, String str, int i, boolean z) {
        this.A00 = i;
        this.A04 = z;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = obj2;
    }

    public final void onFail(C268654dm r5) {
        int A0D;
        int i;
        if (this.A00 != 0) {
            A0D = AnonymousClass0fD.A03(136909761);
            MusicOnProfileProvider musicOnProfileProvider = (MusicOnProfileProvider) this.A02;
            if (AnonymousClass7TF.A1Z(musicOnProfileProvider.A05)) {
                musicOnProfileProvider.A04((JVM) null, this.A03);
            } else {
                musicOnProfileProvider.A00 = true;
            }
            ((AnonymousClass4D7) this.A01).resumeWith((Object) null);
            i = -562374916;
        } else {
            A0D = AnonymousClass7TG.A0D(r5, 1487462280);
            NM4.super.onFail(r5);
            ((C74402PuI) this.A01).DFF();
            i = 207526091;
        }
        AnonymousClass0fD.A0A(i, A0D);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, X.OLT] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032;
        int i;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(1522347716);
            C43805CDx cDx = (C43805CDx) obj;
            int A0D = AnonymousClass7TG.A0D(cDx, -142189475);
            MusicOnProfileProvider musicOnProfileProvider = (MusicOnProfileProvider) this.A02;
            JVM A002 = MusicOnProfileProvider.A00(cDx);
            if (AnonymousClass7TF.A1Z(musicOnProfileProvider.A05)) {
                musicOnProfileProvider.A04(A002, this.A03);
            } else if (this.A04) {
                musicOnProfileProvider.A00 = true;
                musicOnProfileProvider.A01.A0A(A002);
            }
            ((AnonymousClass4D7) this.A01).resumeWith(A002);
            AnonymousClass0fD.A0A(1707674091, A0D);
            i = 875940716;
        } else {
            A032 = AnonymousClass0fD.A03(-1791544082);
            NHO nho = (NHO) obj;
            int A0D2 = AnonymousClass7TG.A0D(nho, -1816331032);
            NM4.super.onSuccess(nho);
            int i2 = nho.A00;
            int i3 = nho.A01;
            String str = nho.A02;
            List unmodifiableList = Collections.unmodifiableList(nho.A04);
            Map unmodifiableMap = Collections.unmodifiableMap(nho.A03);
            ? obj2 = new Object();
            obj2.A00 = i2;
            obj2.A01 = i3;
            obj2.A02 = str;
            obj2.A04 = AnonymousClass7TE.A1D(unmodifiableList);
            obj2.A03 = new HashMap(unmodifiableMap);
            if (this.A04) {
                String str2 = this.A03;
                ((C72183Oxs) ((0lg) this.A02).A01(C72183Oxs.class, C73754PjF.A00)).A00.put(str2, new C53394GnR(System.currentTimeMillis(), obj2, 5));
            }
            ((C74402PuI) this.A01).DU4(obj2);
            AnonymousClass0fD.A0A(-1018805453, A0D2);
            i = -661194785;
        }
        AnonymousClass0fD.A0A(i, A032);
    }
}
