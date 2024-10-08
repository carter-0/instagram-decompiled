package X;

import android.graphics.Matrix;
import android.os.Handler;
import android.view.View;
import java.io.File;
import java.io.FileDescriptor;
import java.util.UUID;

/* renamed from: X.7m3  reason: invalid class name and case insensitive filesystem */
public final class C340927m3 implements C340607lX {
    public C343367q6 A00;
    public C340557lS A01;
    public UUID A02;
    public Handler A03;
    public UUID A04;
    public boolean A05;
    public final C340947m5 A06 = new C340937m4(this);
    public final C340607lX A07;
    public final C340767ln A08;

    public final void A9b(B17 b17, int i) {
        if (A00()) {
            this.A07.A9b(b17, 1);
        }
    }

    public final void AJH(C342077o0 r12, AnonymousClass8GD r13, C340167ko r14, C340557lS r15, C342067nz r16, String str, int i, int i2) {
        String str2 = str;
        if (!this.A05) {
            C340767ln r1 = this.A08;
            this.A04 = r1.A03(this.A03, str2);
            r1.A04(this.A06);
        }
        this.A05 = false;
        C340557lS r6 = r15;
        this.A01 = r15;
        int i3 = C340577lU.A00;
        if (r15 != null) {
            C340577lU.A01.A01(r15);
        }
        this.A07.AJH((C342077o0) null, new C341997ns(r13, this), r14, r6, r16, str2, i, i2);
        UUID uuid = this.A04;
        C340767ln r17 = this.A08;
        if (uuid != r17.A03) {
            this.A04 = r17.A03(this.A03, str2);
        }
    }

    public final boolean APU(AnonymousClass8GD r4) {
        this.A05 = false;
        C340767ln r1 = this.A08;
        if (!r1.A05(this.A04)) {
            if (this.A02 == null) {
                C340557lS r12 = this.A01;
                int i = C340577lU.A00;
                if (r12 != null) {
                    C340577lU.A01.A02(r12);
                }
                this.A01 = null;
                this.A02 = null;
            }
            return false;
        }
        r1.A04(this.A06);
        this.A02 = this.A04;
        return this.A07.APU(new C346477vF(r4, this));
    }

    public final void Cgd(AnonymousClass8GD r3, boolean z, boolean z2, boolean z3) {
        this.A07.Cgd(r3, true, true, z3);
    }

    public final void E24(AnonymousClass8GD r3) {
        if (A00()) {
            this.A07.E24((AnonymousClass8GD) null);
        }
    }

    public final void EJ6(AnonymousClass8GD r3) {
        if (A00()) {
            this.A07.EJ6((AnonymousClass8GD) null);
        }
    }

    public final void Exq(AnonymousClass8GD r3, File file, File file2) {
        if (!A01(r3, "Cannot start video recording.")) {
            this.A07.Exq(r3, file, (File) null);
        }
    }

    public final void Exr(AnonymousClass8GD r3, FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2) {
        if (!A01(r3, "Cannot start video recording.")) {
            this.A07.Exr(r3, fileDescriptor, (FileDescriptor) null);
        }
    }

    public final void Exs(AnonymousClass8GD r3, String str, String str2) {
        if (!A01(r3, "Cannot start video recording.")) {
            this.A07.Exs(r3, str, (String) null);
        }
    }

    public final void FIb(AnonymousClass8GD r3, boolean z, boolean z2, boolean z3) {
        this.A07.FIb(r3, true, true, z3);
    }

    public final boolean A00() {
        if (this.A04 != null) {
            C340767ln r2 = this.A08;
            if (!r2.A04 || !this.A04.equals(r2.A03)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void A8O(C341007mB r2) {
        this.A07.A8O(r2);
    }

    public final void A8q(C340247kw r2) {
        this.A07.A8q(r2);
    }

    public final boolean A9G(C340707lh r2) {
        return this.A07.A9G(r2);
    }

    public final void A9a(B17 b17) {
        if (A00()) {
            this.A07.A9a(b17);
            return;
        }
        throw new C352928Fp("Cannot add OnPreviewFrameListener listener.");
    }

    public final void A9c(AnonymousClass8FP r2) {
        this.A07.A9c(r2);
    }

    public final void A9d(C340347l7 r2) {
        this.A07.A9d(r2);
    }

    public final void AAm(AnonymousClass8GT r2) {
        this.A07.AAm(r2);
    }

    public final int AF4(int i, int i2) {
        return this.A07.AF4(i, i2);
    }

    public final void ARW(boolean z) {
        this.A07.ARW(z);
    }

    public final void ARl(AnonymousClass8GD r2) {
        if (!A01(r2, "Cannot enable video focus mode")) {
            this.A07.ARl(r2);
        }
    }

    public final Handler Aja() {
        return this.A07.Aja();
    }

    public final int Ajk() {
        C343367q6 r0 = this.A00;
        if (r0 != null) {
            return r0.A01;
        }
        throw new C352928Fp("Cannot get current camera facing value.");
    }

    public final C342687p0 AlD() {
        C343367q6 r0 = this.A00;
        if (r0 != null) {
            return r0.A02;
        }
        throw new C352928Fp("Cannot get camera capabilities.");
    }

    public final void BXP(AnonymousClass8GD r2) {
        this.A07.BXP(r2);
    }

    public final void BXQ(AnonymousClass8GD r2, int i) {
        this.A07.BXQ(r2, i);
    }

    public final int BsR() {
        return this.A07.BsR();
    }

    public final C342717p3 Bt2() {
        C343367q6 r0 = this.A00;
        if (r0 != null) {
            return r0.A03;
        }
        throw new C352928Fp("Cannot get current camera settings.");
    }

    public final int CHf() {
        return this.A07.CHf();
    }

    public final void CJd(AnonymousClass8GD r2) {
        this.A07.CJd(r2);
    }

    public final boolean CJf(int i) {
        return this.A07.CJf(i);
    }

    public final void CJq(AnonymousClass8GD r2) {
        this.A07.CJq(r2);
    }

    public final void CMz(Matrix matrix, int i, int i2, int i3) {
        this.A07.CMz(matrix, i, i2, i3);
    }

    public final boolean Ccx() {
        return this.A07.Ccx();
    }

    public final boolean Clf(float[] fArr) {
        return this.A07.Clf(fArr);
    }

    public final void CoY(AnonymousClass8GD r2, C343147pk r3) {
        if (!A01(r2, "Cannot modify settings.")) {
            this.A07.CoY(r2, r3);
        }
    }

    public final void Cru() {
        this.A07.Cru();
    }

    public final void DVY(int i) {
        this.A07.DVY(i);
    }

    public final void E10(AnonymousClass8GD r3, String str, int i) {
        if (!this.A05) {
            this.A04 = this.A08.A03(this.A03, str);
            this.A05 = true;
        }
        this.A07.E10(new C364628lj(r3, this), str, i);
    }

    public final void EAy(String str, View view) {
        this.A07.EAy(str, view);
    }

    public final void EDc(C341007mB r2) {
        this.A07.EDc(r2);
    }

    public final void EDo(C340247kw r2) {
        this.A07.EDo(r2);
    }

    public final void EE2(C340707lh r2) {
        this.A07.EE2(r2);
    }

    public final void EEK(AnonymousClass8FP r2) {
        this.A07.EEK(r2);
    }

    public final void EEL(C340347l7 r2) {
        this.A07.EEL(r2);
    }

    public final void EWv(C365938nv r2) {
        this.A07.EWv(r2);
    }

    public final void EXp(AnonymousClass8GD r3, boolean z) {
        C343367q6 r0 = this.A00;
        if (r0 != null && ((Boolean) r0.A02.A01(C342687p0.A0J)).booleanValue()) {
            this.A07.EXp(r3, z);
        }
    }

    public final void EdB(boolean z) {
        this.A07.EdB(z);
    }

    public final void EeX(C340947m5 r2) {
        this.A07.EeX(r2);
    }

    public final void EgX(AnonymousClass8GD r2, int i) {
        if (!A01(r2, "Cannot set display rotation.")) {
            this.A07.EgX(r2, i);
        }
    }

    public final void Er9(AnonymousClass8GD r2, int i) {
        if (!A01(r2, "Cannot set zoom level.")) {
            this.A07.Er9(r2, i);
        }
    }

    public final boolean ErX(Matrix matrix, int i, int i2, int i3, int i4, boolean z) {
        return this.A07.ErX(matrix, i, i2, i3, i4, z);
    }

    public final void EyT(AnonymousClass8GD r2, boolean z) {
        if (!A01(r2, "Cannot stop video recording")) {
            this.A07.EyT(r2, z);
        }
    }

    public final void EzI(AnonymousClass8GD r4) {
        if (!A01(r4, "Cannot switch camera.")) {
            C343367q6 r2 = this.A00;
            this.A00 = null;
            this.A07.EzI(new C364338lG(r4, r2, this));
        }
    }

    public C340927m3(Handler handler, C340607lX r3, C340767ln r4) {
        this.A03 = handler;
        this.A07 = r3;
        this.A08 = r4;
    }

    public final boolean A01(AnonymousClass8GD r2, String str) {
        if (A00()) {
            return false;
        }
        if (r2 == null) {
            return true;
        }
        r2.A01(new C352928Fp(str));
        return true;
    }

    public final void AW6(int i, int i2) {
        if (A00()) {
            this.A07.AW6(i, i2);
        }
    }

    public final boolean CZk() {
        if (!isConnected() || this.A07.CZk()) {
            return true;
        }
        return false;
    }

    public final boolean CaT() {
        if (!isConnected() || !this.A07.CaT()) {
            return false;
        }
        return true;
    }

    public final boolean Cd1() {
        if (!isConnected() || !this.A07.Cd1()) {
            return false;
        }
        return true;
    }

    public final void EEJ(B17 b17) {
        if (isConnected()) {
            this.A07.EEJ(b17);
        }
    }

    public final void ErA(float f, float f2) {
        if (A00()) {
            this.A07.ErA(f, f2);
        }
    }

    public final void Evu(AnonymousClass8GD r2, float f) {
        if (A00()) {
            this.A07.Evu(r2, f);
        }
    }

    public final void EwE(AnonymousClass8GD r2, int i, int i2) {
        if (A00()) {
            this.A07.EwE(r2, i, i2);
        }
    }

    public final void EzY(C364018kj r3, C363988kg r4) {
        if (!A00()) {
            r3.DCn(new C352928Fp("Cannot take a photo."));
        } else {
            this.A07.EzY(r3, r4);
        }
    }

    public final boolean isConnected() {
        if (!A00() || this.A00 == null || !this.A07.isConnected()) {
            return false;
        }
        return true;
    }
}
