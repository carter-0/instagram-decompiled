package X;

import com.instagram.api.schemas.ClipsTextAlignment;
import com.instagram.api.schemas.ClipsTextEmphasisMode;
import com.instagram.api.schemas.ClipsTextFormatType;
import java.util.ArrayList;
import java.util.List;

public class A9H {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public int A09;
    public int A0A;
    public ClipsTextAlignment A0B;
    public ClipsTextEmphasisMode A0C;
    public ClipsTextFormatType A0D;
    public String A0E;
    public String A0F;
    public List A0G;
    public final C248923io A0H;

    public final C248883ik A00() {
        ClipsTextAlignment clipsTextAlignment = this.A0B;
        List<C248643iK> list = this.A0G;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C248643iK F1o : list) {
            A0r.add(F1o.F1o());
        }
        float f = this.A00;
        float f2 = this.A02;
        float f3 = this.A03;
        String str = this.A0E;
        int i = this.A09;
        float f4 = this.A04;
        float f5 = this.A05;
        float f6 = this.A06;
        float f7 = this.A07;
        float f8 = this.A01;
        String str2 = this.A0F;
        ClipsTextEmphasisMode clipsTextEmphasisMode = this.A0C;
        ClipsTextFormatType clipsTextFormatType = this.A0D;
        return new C248883ik(clipsTextAlignment, clipsTextEmphasisMode, clipsTextFormatType, str, str2, A0r, f, f2, f3, f4, f5, f6, f7, f8, this.A08, i, this.A0A);
    }

    public A9H(C248923io r2) {
        this.A0H = r2;
        this.A0B = r2.Aah();
        this.A0G = r2.Ap5();
        this.A00 = r2.B1g();
        this.A02 = r2.B78();
        this.A03 = r2.BCs();
        this.A0E = r2.getId();
        this.A09 = r2.isAnimated();
        this.A04 = r2.BXs();
        this.A05 = r2.BXu();
        this.A06 = r2.Bog();
        this.A07 = r2.BpU();
        this.A01 = r2.Byr();
        this.A0F = r2.getText();
        this.A0C = r2.C56();
        this.A0D = r2.C5D();
        this.A08 = r2.CGW();
        this.A0A = r2.getZIndex();
    }
}
