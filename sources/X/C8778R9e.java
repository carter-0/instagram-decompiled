package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import java.util.Arrays;

/* renamed from: X.R9e  reason: case insensitive filesystem */
public final class C8778R9e extends C252233om {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C8778R9e(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = obj3;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        S2W s2w;
        File file;
        Integer num;
        if (this.A00 != 0) {
            C308206Td.A0L((C307896Rx) this.A01, this);
            if (i == 1) {
                if (i2 == -1) {
                    S2W s2w2 = (S2W) this.A02;
                    Uri fromFile = Uri.fromFile((File) this.A03);
                    C277014uI r2 = s2w2.A03;
                    if (r2 != null) {
                        C307786Rm r1 = s2w2.A00;
                        AnonymousClass6QE r0 = AnonymousClass6QE.A02;
                        C299275ur.A00(s2w2.A01, new AnonymousClass6Tm(Arrays.asList(new Object[]{r1, Pxi.A0c(fromFile)})), r2);
                        return;
                    }
                    return;
                } else if (i2 == 0) {
                    s2w = (S2W) this.A02;
                    file = (File) this.A03;
                    num = AnonymousClass05K.A0C;
                    s2w.A00(num);
                    file.delete();
                    return;
                }
            }
            s2w = (S2W) this.A02;
            file = (File) this.A03;
            num = AnonymousClass05K.A0N;
            s2w.A00(num);
            file.delete();
            return;
        }
        if (i == 2) {
            if (i2 == -1) {
                if (!SL9.A00) {
                    SL9.A00 = true;
                    Context context = (Context) this.A02;
                    C307896Rx r3 = (C307896Rx) this.A03;
                    AnonymousClass6Tm r22 = (AnonymousClass6Tm) this.A01;
                    if (!(intent == null || intent.getData() == null)) {
                        try {
                            OOC ooc = new OOC();
                            Uri data = intent.getData();
                            0qQ.A0B(data, 1);
                            ooc.A01(context, data);
                            Uri fromFile2 = Uri.fromFile(ooc.A00());
                            if (fromFile2 != null) {
                                SS4.A02(fromFile2, r3, r22);
                            }
                        } catch (RuntimeException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } else if (i2 == 0) {
                SS4.A03((C307896Rx) this.A03, (AnonymousClass6Tm) this.A01);
            }
        }
        C308206Td.A0L((C307896Rx) this.A03, this);
    }

    public final void onDestroyView() {
        Object obj;
        if (this.A00 != 0) {
            obj = this.A01;
        } else {
            obj = this.A03;
        }
        C308206Td.A0L((C307896Rx) obj, this);
    }
}
