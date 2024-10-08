package X;

import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.cell.text.formatter.TextFormatter;
import com.facebookpay.form.cell.text.util.TextFieldHandler;
import com.fbpay.theme.FBPayIcon;
import com.google.common.collect.ImmutableList;

/* renamed from: X.QfJ  reason: case insensitive filesystem */
public class C8029QfJ extends C10782Ry3 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public TextFormatter A04;
    public TextFieldHandler A05;
    public FBPayIcon A06;
    public ImmutableList A07;
    public Integer A08 = AnonymousClass05K.A0N;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final ImmutableList.Builder A0G = Pxe.A0Y();

    public TextCellParams A01() {
        ImmutableList build = this.A0G.build();
        0qQ.A0B(build, 0);
        this.A07 = build;
        return new TextCellParams(this);
    }

    public C8029QfJ(int i) {
        super(i);
    }

    public static void A00(C8029QfJ qfJ, ImmutableList.Builder builder) {
        builder.add(qfJ.A01());
    }
}
