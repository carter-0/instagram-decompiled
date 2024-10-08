package X;

import android.os.Bundle;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.privacy.zone.policy.ZonePolicy;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.QKt  reason: case insensitive filesystem */
public final class C7578QKt extends C11364SPc implements B3J, C13923TlR, C13922TlQ {
    public QLA A00;
    public boolean A01;
    public boolean A02 = false;
    public final C39884ADg A03 = new C39884ADg();
    public final C10854RzE A04;
    public final MessageDigest A05;
    public final List A06 = AnonymousClass7TE.A1C();
    public final Map A07 = AnonymousClass7TE.A1E();
    public final Map A08;
    public final Map A09;
    public final Map A0A;
    public final Map A0B = AnonymousClass7TE.A1E();
    public final Map A0C = AnonymousClass7TE.A1E();
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final List A0H = AnonymousClass7TE.A1C();

    public static void A00(C7578QKt qKt) {
        HashMap hashMap;
        HashSet hashSet;
        HashSet hashSet2;
        Bundle bundle;
        if (!qKt.A02) {
            HashMap A1E = AnonymousClass7TE.A1E();
            C39884ADg aDg = qKt.A03;
            Set set = aDg.A02;
            synchronized (set) {
                hashMap = new HashMap(aDg.A00);
            }
            Iterator A0u = AnonymousClass7TF.A0u(hashMap);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                Pxe.A1X(A1J.getKey(), A1E, (long) C66582MXn.A08(A1J));
            }
            C10854RzE rzE = qKt.A04;
            List list = qKt.A0H;
            0qQ.A0B(list, 0);
            rzE.A06 = list;
            List list2 = qKt.A06;
            0qQ.A0B(list2, 0);
            rzE.A05 = list2;
            synchronized (set) {
                hashSet = new HashSet(set);
            }
            rzE.A0E = hashSet;
            rzE.A0C = A1E;
            synchronized (set) {
                hashSet2 = new HashSet(aDg.A01);
            }
            rzE.A0D = hashSet2;
            rzE.A0F = qKt.A01;
            Map map = qKt.A0B;
            0qQ.A0B(map, 0);
            rzE.A07 = map;
            Map map2 = qKt.A07;
            0qQ.A0B(map2, 0);
            rzE.A08 = map2;
            rzE.A09 = qKt.A08;
            rzE.A0B = qKt.A0A;
            rzE.A0A = qKt.A09;
            qKt.A02 = true;
            SRY A002 = SRY.A00();
            Map singletonMap = Collections.singletonMap("INTEGRITY_LOGGER", new T9J(rzE));
            C340027ka r2 = qKt.A03;
            ZonePolicy zonePolicy = null;
            if (r2 == null) {
                bundle = null;
            } else {
                BrowserLiteFragment browserLiteFragment = (BrowserLiteFragment) r2;
                bundle = browserLiteFragment.A08;
                zonePolicy = browserLiteFragment.A0e;
            }
            SRY.A02(new C7559QJj(bundle, A002, zonePolicy, singletonMap), A002, false);
        }
    }

    public C7578QKt(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        MessageDigest messageDigest;
        C10854RzE rzE = new C10854RzE();
        this.A04 = rzE;
        this.A08 = AnonymousClass7TE.A1E();
        this.A0A = AnonymousClass7TE.A1E();
        this.A09 = AnonymousClass7TE.A1E();
        0qQ.A0B(str, 0);
        rzE.A01 = str;
        this.A01 = false;
        this.A0E = z;
        this.A0F = z2;
        this.A0D = z3;
        this.A0G = z4;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        this.A05 = messageDigest;
    }
}
