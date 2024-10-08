package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.MemoryFile;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.9m8  reason: invalid class name and case insensitive filesystem */
public final class C387389m8 extends AnonymousClass8HG {
    public int A00;
    public int A01;
    public int A02;
    public Rect A03;
    public AnonymousClass8HJ A04 = AnonymousClass8HJ.NORMAL;
    public B17 A05;
    public C21986Xoh A06;
    public SOH A07;
    public File A08;
    public boolean A09;
    public final List A0A = new LinkedList();
    public final AnonymousClass0eM A0B = AnonymousClass0eN.A01(new C41398AtK(0));
    public volatile int A0C;
    public volatile int A0D;
    public volatile long A0E = -1;
    public volatile long A0F = -1;
    public volatile String A0G;
    public volatile boolean A0H;
    public volatile MemoryFile[] A0I;

    public static void A00(C387389m8 r5) {
        boolean z;
        if (r5.A0A.size() >= r5.A0D) {
            if (r5.A0F < 200000000) {
                0kD.A03("BoomerangCaptureController", 002.A0Q("Capture time too short: ", r5.A0F));
                z = false;
            } else {
                z = true;
            }
            r5.A08(z);
        }
    }

    public static void A01(C387389m8 r5) {
        SOH soh = r5.A07;
        if (soh != null) {
            if (soh.A02.compareAndSet(0, 2)) {
                SOH.A00(soh);
            }
            r5.A07 = null;
        }
        r5.A0M.set(0);
        r5.A08 = null;
        r5.A06 = null;
        r5.A03 = null;
        r5.A0G = null;
        r5.A0E = -1;
        r5.A0F = -1;
        r5.A0C = 0;
        r5.A0H = false;
        r5.A02 = 0;
        r5.A01 = 0;
        r5.A00 = 0;
        r5.A0A = false;
        r5.A09 = false;
        r5.A0A.clear();
        MemoryFile[] memoryFileArr = r5.A0I;
        if (memoryFileArr != null) {
            for (MemoryFile memoryFile : memoryFileArr) {
                if (memoryFile != null) {
                    memoryFile.close();
                }
            }
            r5.A0I = null;
        }
    }

    public static boolean A02(C387389m8 r2, String str) {
        if (!str.equals(r2.A0G) || r2.A0M.get() != 1) {
            return false;
        }
        return true;
    }

    public C387389m8(Context context, View view, UserSession userSession, C357638Yz r6, C353028Fz r7, AnonymousClass8AL r8, C3503684j r9, C3496881i r10, AnonymousClass80U r11, boolean z) {
        super(context, view, userSession, r6, r7, r8, r9, r10, r11, z);
    }
}
