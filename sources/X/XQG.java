package X;

public final class XQG extends 1aJ {
    public final Object[] A00;

    public final void A02(1aL r7) {
        XQL xql = new XQL(r7, this.A00);
        r7.Do4(xql);
        if (!xql.A01) {
            Object[] objArr = xql.A03;
            int length = objArr.length;
            int i = 0;
            while (i < length && !xql.A04) {
                Object obj = objArr[i];
                if (obj == null) {
                    xql.A02.onError(AnonymousClass7TE.A11(002.A0c("The ", "th element is null", i)));
                    return;
                } else {
                    xql.A02.DUK(obj);
                    i++;
                }
            }
            if (!xql.A04) {
                xql.A02.onComplete();
            }
        }
    }

    public XQG(Object[] objArr) {
        this.A00 = objArr;
    }
}
