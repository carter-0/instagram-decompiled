package X;

import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import org.webrtc.CameraCapturer;

/* renamed from: X.Swl  reason: case insensitive filesystem */
public final class C12535Swl implements C266204Xy {
    public final void AGO() {
    }

    public final void Cg1() {
        IOException iOException;
        synchronized (SN0.A02) {
            Object obj = SN0.A03;
            synchronized (obj) {
                try {
                    if (!SN0.A01) {
                        synchronized (obj) {
                            try {
                            } catch (Throwable th) {
                                while (true) {
                                    th = th;
                                    break;
                                }
                            }
                        }
                        InetAddress byName = InetAddress.getByName("time.android.com");
                        DatagramSocket datagramSocket = new DatagramSocket();
                        try {
                            datagramSocket.setSoTimeout(CameraCapturer.OPEN_CAMERA_TIMEOUT);
                            byte[] bArr = new byte[48];
                            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
                            bArr[0] = 27;
                            long currentTimeMillis = System.currentTimeMillis();
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (currentTimeMillis == 0) {
                                Arrays.fill(bArr, 40, 48, (byte) 0);
                            } else {
                                long j = currentTimeMillis / 1000;
                                long j2 = currentTimeMillis - (j * 1000);
                                long j3 = j + 2208988800L;
                                bArr[40] = (byte) ((int) (j3 >> 24));
                                bArr[41] = (byte) ((int) (j3 >> 16));
                                bArr[42] = (byte) ((int) (j3 >> 8));
                                bArr[43] = (byte) ((int) (j3 >> 0));
                                long j4 = (j2 * 4294967296L) / 1000;
                                bArr[44] = (byte) ((int) (j4 >> 24));
                                bArr[45] = (byte) ((int) (j4 >> 16));
                                bArr[46] = (byte) ((int) (j4 >> 8));
                                bArr[47] = (byte) ((int) (Math.random() * 255.0d));
                            }
                            datagramSocket.send(datagramPacket);
                            datagramSocket.receive(new DatagramPacket(bArr, 48));
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            long j5 = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
                            byte b = bArr[0];
                            byte b2 = (byte) ((b >> 6) & 3);
                            byte b3 = (byte) (b & 7);
                            byte b4 = bArr[1] & 255;
                            long A00 = SN0.A00(bArr, 24);
                            long A002 = SN0.A00(bArr, 32);
                            long A003 = SN0.A00(bArr, 40);
                            if (b2 == 3) {
                                iOException = JTO.A0u("SNTP: Unsynchronized server");
                            } else if (b3 != 4 && b3 != 5) {
                                iOException = JTO.A0u(002.A0O("SNTP: Untrusted mode: ", b3));
                            } else if (b4 == 0 || b4 > 15) {
                                iOException = JTO.A0u(002.A0O("SNTP: Untrusted stratum: ", b4));
                            } else if (A003 != 0) {
                                long j6 = (j5 + (((A002 - A00) + (A003 - j5)) / 2)) - elapsedRealtime2;
                                datagramSocket.close();
                                synchronized (obj) {
                                    try {
                                        SN0.A00 = j6;
                                        SN0.A01 = true;
                                    } catch (Throwable th2) {
                                        while (true) {
                                            th = th2;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                iOException = JTO.A0u("SNTP: Zero transmitTime");
                            }
                            throw iOException;
                        } catch (Throwable th3) {
                            C9153RRe.A00(th, th3);
                        }
                    }
                } catch (Throwable th4) {
                    while (true) {
                        th = th4;
                        break;
                    }
                }
            }
        }
        return;
        throw th;
    }
}
