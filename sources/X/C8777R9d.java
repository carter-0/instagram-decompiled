package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.R9d  reason: case insensitive filesystem */
public final class C8777R9d extends C252233om {
    public final int A00;
    public final Object A01;

    public C8777R9d(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C307896Rx r0;
        C307896Rx r2;
        C277014uI r1;
        Object[] objArr;
        String str;
        char c;
        C307896Rx r3;
        C277014uI r22;
        String str2;
        Object[] objArr2;
        if (this.A00 != 0) {
            if (i == 1 && i2 == -1) {
                SFS sfs = (SFS) this.A01;
                String str3 = sfs.A01;
                if (str3 != null) {
                    C10621RvF rvF = sfs.A04;
                    c = 0;
                    try {
                        AnonymousClass6QE r02 = AnonymousClass6QE.A02;
                        str2 = Pxi.A0c(DbT.A09(str3));
                        if (str2 != null) {
                            r3 = rvF.A00;
                            r22 = rvF.A02;
                            objArr2 = new Object[1];
                        }
                    } catch (SecurityException e) {
                        C308206Td.A0E(rvF.A00, rvF.A01, Pxf.A1Z(e));
                    }
                } else {
                    C10621RvF rvF2 = sfs.A04;
                    RuntimeException A15 = AnonymousClass7TE.A15("Null Uri or Path");
                    c = 0;
                    r3 = rvF2.A00;
                    r22 = rvF2.A01;
                    objArr2 = new Object[1];
                    str2 = A15.getMessage();
                }
                objArr2[c] = str2;
                C308206Td.A0E(r3, r22, objArr2);
            }
            r0 = ((SFS) this.A01).A00;
        } else {
            if (i == 1 && i2 == -1) {
                if (intent == null || intent.getData() == null) {
                    C10620RvE rvE = ((SFH) this.A01).A03;
                    C308206Td.A0E(rvE.A00, rvE.A01, Pxf.A1Z(AnonymousClass7TE.A15("Intent returned was either null or had null data")));
                } else {
                    try {
                        OOC ooc = new OOC();
                        SFH sfh = (SFH) this.A01;
                        Context context = sfh.A02;
                        Uri data = intent.getData();
                        0qQ.A0B(data, 1);
                        ooc.A01(context, data);
                        Uri fromFile = Uri.fromFile(ooc.A00());
                        if (fromFile == null || fromFile.getPath() == null) {
                            C10620RvE rvE2 = sfh.A03;
                            RuntimeException A152 = AnonymousClass7TE.A15("Unable to retrieve Uri from SecureSharedFileReceiver");
                            r2 = rvE2.A00;
                            r1 = rvE2.A01;
                            objArr = Pxf.A1Z(A152);
                        } else {
                            C10620RvE rvE3 = sfh.A03;
                            String A0R = 002.A0R("file://", fromFile.getPath());
                            0qQ.A0B(A0R, 0);
                            try {
                                AnonymousClass6QE r03 = AnonymousClass6QE.A02;
                                str = Pxi.A0c(DbT.A09(A0R));
                                if (str != null) {
                                    r2 = rvE3.A00;
                                    r1 = rvE3.A02;
                                    objArr = new Object[1];
                                    objArr[0] = str;
                                }
                            } catch (SecurityException e2) {
                                r2 = rvE3.A00;
                                r1 = rvE3.A01;
                                objArr = new Object[1];
                                str = e2.getMessage();
                            }
                        }
                        C308206Td.A0E(r2, r1, objArr);
                    } catch (SecurityException e3) {
                        C10620RvE rvE4 = ((SFH) this.A01).A03;
                        C308206Td.A0E(rvE4.A00, rvE4.A01, Pxf.A1Z(e3));
                    }
                }
            }
            r0 = ((SFH) this.A01).A00;
        }
        C308206Td.A0L(r0, this);
    }

    public final void onDestroyView() {
        C307896Rx r0;
        if (this.A00 != 0) {
            r0 = ((SFS) this.A01).A00;
        } else {
            r0 = ((SFH) this.A01).A00;
        }
        C308206Td.A0L(r0, this);
    }
}
