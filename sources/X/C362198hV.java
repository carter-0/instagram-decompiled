package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.8hV  reason: invalid class name and case insensitive filesystem */
public final class C362198hV {
    public AnonymousClass59G A00 = new AnonymousClass59G(false, false, false);
    public boolean A01;
    public final UserSession A02;
    public final C357638Yz A03;
    public final C362168hS A04;
    public final AnonymousClass8XA A05;
    public final GalleryMemoriesViewModel A06;
    public final ClipsCreationViewModel A07;
    public final C3511387s A08;
    public final C62320sa A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final AnonymousClass4DH A0E;
    public final C62320sa A0F;
    public final boolean A0G;

    public C362198hV(AnonymousClass4DH r3, UserSession userSession, C357638Yz r5, C362168hS r6, AnonymousClass8XA r7, GalleryMemoriesViewModel galleryMemoriesViewModel, ClipsCreationViewModel clipsCreationViewModel, C3511387s r10, C62320sa r11, C62320sa r12, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        0qQ.A0B(r6, 15);
        this.A0E = r3;
        this.A02 = userSession;
        this.A03 = r5;
        this.A0G = z;
        this.A05 = r7;
        this.A0D = z2;
        this.A0C = z3;
        this.A08 = r10;
        this.A07 = clipsCreationViewModel;
        this.A0B = z4;
        this.A0F = r11;
        this.A09 = r12;
        this.A0A = z5;
        this.A06 = galleryMemoriesViewModel;
        this.A04 = r6;
    }

    public final boolean A00() {
        return ((Boolean) this.A00.A00).booleanValue();
    }

    public final boolean A01() {
        if ((this.A03.A08.A00 instanceof AnonymousClass9QA) && A04()) {
            if (!182.A06(0Tu.A05, this.A02, 36330930788385624L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A02() {
        String string = this.A0E.requireArguments().getString("ARGS_CAMERA_TOOL_ID");
        if (string == null || C352618Eb.A03(string) != C358088aL.A0s) {
            return false;
        }
        return true;
    }

    public final boolean A03() {
        UserSession userSession;
        0Tu r2;
        long j;
        Object obj = this.A03.A08.A00;
        if (!(obj instanceof AnonymousClass80O)) {
            if (obj instanceof AnonymousClass9QA) {
                if (!A04()) {
                    return false;
                }
                userSession = this.A02;
                r2 = 0Tu.A05;
                j = 36328512721796483L;
            }
            return true;
        } else if (!A04()) {
            return false;
        } else {
            userSession = this.A02;
            r2 = 0Tu.A05;
            j = 36328684520619542L;
        }
        if (!182.A06(r2, userSession, j)) {
            return true;
        }
        return false;
    }

    public final boolean A04() {
        UserSession userSession;
        0Tu r2;
        long j;
        Bundle bundle = this.A0E.mArguments;
        if (bundle != null && bundle.getBoolean("ARGS_HIDE_GALLERY_DESTINATION_BAR")) {
            return false;
        }
        Object obj = this.A03.A08.A00;
        if (obj instanceof AnonymousClass80N) {
            if (!this.A01 || this.A04.A0K.getValue() != null || this.A0D || this.A0C || this.A08.A04 != null) {
                return false;
            }
            if (A00() || this.A05.A0a.CKX() || !this.A07.A0s()) {
                if (!A00()) {
                    return false;
                }
                userSession = this.A02;
                r2 = 0Tu.A05;
                j = 36319991507066732L;
            }
            return true;
        } else if ((obj instanceof C3493880e) || !(obj instanceof AnonymousClass9QA) || !this.A01 || this.A04.A0K.getValue() != null || this.A0D || this.A0C) {
            return false;
        } else {
            userSession = this.A02;
            r2 = 0Tu.A05;
            j = 36320253499678855L;
        }
        if (182.A06(r2, userSession, j)) {
            return true;
        }
        return false;
    }

    public final boolean A05() {
        if ((this.A03.A08.A00 instanceof AnonymousClass80O) && A06()) {
            if (!182.A06(0Tu.A05, this.A02, 36321924241958751L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A06() {
        UserSession userSession;
        0Tu r2;
        long j;
        Object obj = this.A03.A08.A00;
        if (obj instanceof AnonymousClass80O) {
            if (!A04() || this.A0G || A02()) {
                return false;
            }
            if (A00()) {
                userSession = this.A02;
                r2 = 0Tu.A05;
                j = 36319991507066732L;
            }
            return true;
        } else if (!(obj instanceof AnonymousClass9QA) || this.A0B) {
            return false;
        } else {
            if (((Number) this.A0F.invoke()).intValue() <= 0) {
                if (!A04()) {
                    return false;
                }
                userSession = this.A02;
                r2 = 0Tu.A05;
                j = 36329418959896682L;
            }
            return true;
        }
        if (!182.A06(r2, userSession, j)) {
            return true;
        }
        return false;
    }

    public final boolean A07() {
        if (!(this.A03.A08.A00 instanceof AnonymousClass80O)) {
            return false;
        }
        if (!A00()) {
            if (182.A06(0Tu.A05, this.A02, 36319991506870121L)) {
                return true;
            }
        }
        if (!A00()) {
            return false;
        }
        if (182.A06(0Tu.A05, this.A02, 36319991507066732L)) {
            return true;
        }
        return false;
    }

    public final boolean A08() {
        UserSession userSession = this.A02;
        Object obj = this.A03.A08.A00;
        28D r1 = (28D) this.A09.invoke();
        0qQ.A0B(obj, 1);
        0qQ.A0B(r1, 2);
        if (!obj.equals(AnonymousClass9QA.A00) || !C339097j3.A00(r1)) {
            return false;
        }
        Context context = C60960kU.A00;
        0qQ.A07(context);
        if (!C305756Jk.A00(context)) {
            return false;
        }
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36327258591541521L)) {
            return false;
        }
        if (!HYV.A00(userSession).A01() || !182.A06(r2, userSession, 36327258594687287L)) {
            return true;
        }
        return false;
    }
}
