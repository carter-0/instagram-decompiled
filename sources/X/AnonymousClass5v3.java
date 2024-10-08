package X;

import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.Execution;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.5v3  reason: invalid class name */
public final class AnonymousClass5v3 extends 1P0 {
    public final C299355v0 A00;
    public final C299365v1 A01;
    public final File A02;
    public final DataTask A03;

    public AnonymousClass5v3(DataTask dataTask, C299355v0 r2, C299365v1 r3, File file) {
        this.A00 = r2;
        this.A02 = file;
        this.A03 = dataTask;
        this.A01 = r3;
    }

    public final void A00(C296005pI r10) {
        IOException th;
        IllegalArgumentException th2;
        IOException th3;
        int A032 = AnonymousClass0fD.A03(4676461);
        if (this.A03.mTaskType == 1) {
            try {
                File file = this.A02;
                if (file != null) {
                    File createTempFile = File.createTempFile("NetworkSessionDownload", (String) null, file);
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    try {
                        1Qb A002 = r10.A01.A00();
                        if (A002 != null) {
                            try {
                                C296025pK.A00(this.A00.AEJ(A002.AJg()), A002.AjD(), fileOutputStream);
                                A002.close();
                                Execution.executeAsync(new C296055pN(new C268674do(new C296045pM(r10.A00, createTempFile, (byte[]) null)), this.A01), (AccountSession) null, 3);
                                fileOutputStream.close();
                            } catch (Throwable th4) {
                                C9153RRe.A00(th3, th4);
                            }
                        } else {
                            th3 = new IOException("expected a urlResponse body but was null.");
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th6) {
                            C9153RRe.A00(th2, th6);
                        }
                    }
                } else {
                    th2 = new IllegalArgumentException("Download Response File must not be null");
                    throw th2;
                }
            } catch (IOException | SecurityException e) {
                Execution.executeAsync(new C296055pN(new C268664dn(e), this.A01), (AccountSession) null, 3);
            }
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                1Qb A003 = r10.A01.A00();
                if (A003 != null) {
                    try {
                        C296025pK.A00((OFG) null, A003.AjD(), byteArrayOutputStream);
                        A003.close();
                        Execution.executeAsync(new C296055pN(new C268674do(new C296045pM(r10.A00, (File) null, byteArrayOutputStream.toByteArray())), this.A01), (AccountSession) null, 3);
                        byteArrayOutputStream.close();
                    } catch (Throwable th7) {
                        C9153RRe.A00(th, th7);
                    }
                } else {
                    th = new IOException("expected a urlResponse body but was null.");
                    throw th;
                }
            } catch (Throwable th8) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th9) {
                    C9153RRe.A00(th8, th9);
                }
                throw th8;
            }
        }
        AnonymousClass0fD.A0A(1533605567, A032);
    }

    public final void onFail(C268654dm r8) {
        Throwable e;
        int A032 = AnonymousClass0fD.A03(-1050989141);
        C299365v1 r6 = this.A01;
        if (r8 instanceof C268674do) {
            Object A002 = r8.A00();
            A002.getClass();
            C296005pI r1 = (C296005pI) A002;
            try {
                2ZL r5 = r1.A01;
                1Qb A003 = r5.A00();
                if (A003 != null) {
                    A003.close();
                }
                e = new IOException(002.A05(r1.mStatusCode, "(", ") ", r5.A03));
            } catch (IOException e2) {
                e = e2;
            }
        } else {
            e = r8.A01();
            if (!(e instanceof IOException)) {
                e = new IOException(e);
            }
        }
        Execution.executeAsync(new C296055pN(new C268664dn(e), r6), (AccountSession) null, 3);
        AnonymousClass0fD.A0A(-350104586, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1851917304);
        A00((C296005pI) obj);
        AnonymousClass0fD.A0A(857799128, A032);
    }
}
