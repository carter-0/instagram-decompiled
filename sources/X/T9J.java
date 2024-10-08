package X;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class T9J implements Serializable {
    public final Boolean A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final Map A08;
    public final Map A09;
    public final Map A0A;
    public final Map A0B;
    public final Set A0C;
    public final Set A0D;
    public final Map A0E;
    public final Map A0F;

    public T9J(C10854RzE rzE) {
        this.A07 = rzE.A06;
        this.A06 = rzE.A05;
        this.A0D = rzE.A0E;
        this.A0A = rzE.A0C;
        this.A01 = rzE.A00;
        this.A03 = rzE.A02;
        this.A05 = rzE.A04;
        this.A04 = rzE.A03;
        this.A0C = rzE.A0D;
        this.A00 = Boolean.valueOf(rzE.A0F);
        this.A02 = rzE.A01;
        this.A0B = rzE.A07;
        this.A08 = rzE.A08;
        this.A09 = rzE.A09;
        this.A0F = rzE.A0B;
        this.A0E = rzE.A0A;
    }
}
