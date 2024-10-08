package X;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.8XZ  reason: invalid class name */
public final class AnonymousClass8XZ {
    public static final AnonymousClass0eM A0K = AnonymousClass0eN.A01(C357228Xa.A00);
    public int A00;
    public int A01;
    public AnonymousClass8XO A02;
    public AnonymousClass8XR A03;
    public WeakReference A04;
    public boolean A05;
    public final Context A06;
    public final ContentObserver A07;
    public final ContentObserver A08;
    public final Handler A09 = new Handler(Looper.getMainLooper());
    public final boolean A0A;
    public final int A0B;
    public final long A0C;
    public final long A0D;
    public final AnonymousClass07i A0E;
    public final C348927zH A0F;
    public final UserSession A0G;
    public final 2Cn A0H;
    public final boolean A0I;
    public final boolean A0J;

    public AnonymousClass8XZ(Context context, AnonymousClass07i r5, C348927zH r6, AnonymousClass8XO r7, UserSession userSession, 2Cn r9, int i, int i2, long j, long j2, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(r7, 4);
        this.A0G = userSession;
        this.A06 = context;
        this.A0E = r5;
        this.A02 = r7;
        this.A01 = i;
        this.A0B = i2;
        this.A0A = z;
        this.A0J = z2;
        this.A0D = j;
        this.A0C = j2;
        this.A0F = r6;
        this.A0I = z3;
        this.A0H = new C357238Xb(this, r9);
        this.A04 = new WeakReference((Object) null);
        C357248Xc r2 = new C357248Xc(this, r9);
        this.A07 = new C357258Xd(this.A09, this, r2);
        this.A08 = new C357258Xd(this.A09, this, r2);
    }

    public static final void A00(AnonymousClass8XZ r3) {
        if (r3.A05) {
            r3.A05 = false;
            try {
                r3.A06.getContentResolver().unregisterContentObserver(r3.A07);
            } catch (IllegalStateException e) {
                0KC.A05(AnonymousClass8XZ.class, "Photo ContentObserver not registered", e);
            }
            try {
                r3.A06.getContentResolver().unregisterContentObserver(r3.A08);
            } catch (IllegalStateException e2) {
                0KC.A05(AnonymousClass8XZ.class, "Video ContentObserver not registered", e2);
            }
        }
    }

    public final void A01(2Cn r20) {
        2Cn r1 = r20;
        UserSession userSession = this.A0G;
        Context context = this.A06;
        AnonymousClass8XO r7 = this.A02;
        int i = this.A01;
        int i2 = this.A0B;
        boolean z = this.A0J;
        long j = this.A0D;
        long j2 = this.A0C;
        AnonymousClass8XR r9 = this.A03;
        boolean z2 = z;
        C357288Xh r4 = new C357288Xh(context, this.A0F, r7, userSession, r9, i, i2, this.A00, j, j2, z2, this.A0I);
        Object obj = this.A04.get();
        if (obj == null || !obj.equals(r4)) {
            this.A04 = new WeakReference(r4);
            C290815g0 r3 = new C290815g0(r4, 452);
            if (r20 == null) {
                r1 = this.A0H;
            }
            r3.A00 = new C357238Xb(this, r1);
            AnonymousClass07i r0 = this.A0E;
            if (r0 != null) {
                1ES.A00(context, r0, r3);
            }
            if (this.A0A) {
                ((AnonymousClass0vF) A0K.getValue()).ATE(new C357298Xi(this));
            }
        }
    }
}
