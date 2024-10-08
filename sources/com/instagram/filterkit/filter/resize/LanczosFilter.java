package com.instagram.filterkit.filter.resize;

import X.002;
import X.0qQ;
import X.0wb;
import X.0xY;
import X.AnonymousClass000;
import X.AnonymousClass9S9;
import X.C14261Tsj;
import X.C14268Tsr;
import X.C14270Tst;
import X.C14278TtB;
import X.C17857VhA;
import X.DbV;
import X.Pxg;
import X.UmC;
import X.VY1;
import X.W6E;
import X.X98;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.filterkit.filter.BaseFilter;
import com.instagram.util.creation.ShaderBridge;

public class LanczosFilter extends BaseFilter {
    public static final C14270Tst A0E = C14268Tsr.A00();
    public static final Parcelable.Creator CREATOR = new W6E(49);
    public C17857VhA A00;
    public C17857VhA A01;
    public C14261Tsj A02;
    public C14261Tsj A03;
    public C14278TtB A04;
    public C14278TtB A05;
    public C14278TtB A06;
    public C14278TtB A07;
    public C14278TtB A08;
    public C14278TtB A09;
    public UmC A0A;
    public UmC A0B;
    public VY1 A0C;
    public final boolean A0D;

    public static int A00(String str, String str2) {
        String str3 = str;
        int compileProgram = ShaderBridge.compileProgram(str3, false, false, true, false, false, false);
        if (compileProgram == 0) {
            0wb.A03(002.A0g("LanczosFilter", "_compile_", str3), "");
            0xY AR4 = DbV.A0d().AR4();
            AR4.E5T(AnonymousClass000.A00(3620), false);
            AR4.apply();
            compileProgram = ShaderBridge.compileProgram(str2, false, false, true, false, false, false);
            if (compileProgram == 0) {
                0wb.A03(002.A0g("LanczosFilter", "_compile_", str2), "");
                String A0R = 002.A0R("Error compiling shader ", str2);
                0qQ.A0B(A0R, 1);
                throw new Exception(A0R);
            }
        }
        return compileProgram;
    }

    public final void AHH(X98 x98) {
        C14261Tsj tsj = this.A02;
        if (tsj != null) {
            int i = tsj.A00;
            BitmapFactory.Options options = AnonymousClass9S9.A00;
            GLES20.glDeleteProgram(i);
            this.A02 = null;
        }
        C14261Tsj tsj2 = this.A03;
        if (tsj2 != null) {
            int i2 = tsj2.A00;
            BitmapFactory.Options options2 = AnonymousClass9S9.A00;
            GLES20.glDeleteProgram(i2);
            this.A03 = null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.VY1, java.lang.Object] */
    public LanczosFilter(Parcel parcel) {
        this.A0C = new Object();
        this.A0D = Pxg.A1U(parcel);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.VY1, java.lang.Object] */
    public LanczosFilter() {
        this.A0C = new Object();
        this.A0D = false;
    }
}
