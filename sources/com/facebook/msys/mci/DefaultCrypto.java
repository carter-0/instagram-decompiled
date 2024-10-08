package com.facebook.msys.mci;

import X.002;
import X.02V;
import X.0KC;
import X.0cp;
import X.C56478HzA;
import X.C9153RRe;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class DefaultCrypto implements Crypto {
    public static final Crypto A00 = new Object();

    public byte[] computeMd5(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte valueOf : digest) {
                sb.append(String.format("%02x", new Object[]{Byte.valueOf(valueOf)}));
            }
            return sb.toString().getBytes();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 algorithm was not found. Should not happen", e);
        }
    }

    public final byte[] computeMd5V2(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            return C56478HzA.A00(instance.digest()).toLowerCase(Locale.US).getBytes();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 algorithm was not found. Should not happen", e);
        }
    }

    public final String computeSHA256(String str, String str2) {
        RuntimeException runtimeException;
        Throwable th;
        FileInputStream fileInputStream;
        int read;
        String str3 = str;
        try {
            Uri A03 = 0cp.A03(str3);
            String scheme = A03.getScheme();
            if (TextUtils.isEmpty(scheme)) {
                th = new IllegalArgumentException(002.A0R("Invalid fileUrlString: ", str3));
            } else if (scheme.equalsIgnoreCase("file")) {
                String path = A03.getPath();
                if (!TextUtils.isEmpty(path)) {
                    File file = new File(path);
                    if (file.exists()) {
                        String path2 = file.getPath();
                        try {
                            fileInputStream = new FileInputStream(path2);
                            byte[] bArr = new byte[8192];
                            long length = new File(path2).length();
                            Mac instance = Mac.getInstance("HmacSHA256");
                            instance.init(new SecretKeySpec(str2.getBytes(), "HmacSHA256"));
                            long j = length;
                            long j2 = 0;
                            boolean z = true;
                            while (j > 0 && (read = fileInputStream.read(bArr)) != -1) {
                                int i = 0;
                                while (z && i < 8192) {
                                    z = false;
                                    if (bArr[i] == 0) {
                                        z = true;
                                    }
                                    i++;
                                }
                                int min = Math.min((int) j, read);
                                instance.update(bArr, 0, min);
                                j2 += (long) read;
                                j -= (long) min;
                            }
                            if (!z && j2 == length && j == 0) {
                                String lowerCase = C56478HzA.A00(instance.doFinal()).toLowerCase(Locale.US);
                                fileInputStream.close();
                                return lowerCase;
                            }
                            0KC.A0A(DefaultCrypto.class, "Read bytes failed.TotalBytesRead: %d, FileSize: %d", new Object[]{Long.valueOf(j2), Long.valueOf(length)});
                            throw new RuntimeException("Unable to read all bytes from file");
                        } catch (NoSuchAlgorithmException e) {
                            runtimeException = new RuntimeException("HMAC SHA256 algorithm is not found.", e);
                            throw runtimeException;
                        } catch (UnsupportedEncodingException e2) {
                            runtimeException = new RuntimeException("UTF_8 encoding is not supported.", e2);
                            throw runtimeException;
                        } catch (InvalidKeyException e3) {
                            runtimeException = new RuntimeException("Invalid secret key.", e3);
                            throw runtimeException;
                        } catch (IOException e4) {
                            runtimeException = new RuntimeException("Couldn't read the content.", e4);
                            throw runtimeException;
                        } catch (IllegalStateException e5) {
                            runtimeException = new RuntimeException("Couldn't update the hash.", e5);
                            throw runtimeException;
                        } catch (IllegalArgumentException e6) {
                            runtimeException = new RuntimeException("Invalid arguments", e6);
                            throw runtimeException;
                        } catch (Exception e7) {
                            try {
                                runtimeException = new RuntimeException("Unexpected exception", e7);
                                throw runtimeException;
                            } catch (RuntimeException e8) {
                                0KC.A05(DefaultCrypto.class, "computeSHA256 with fileUrl: exception occurred", e8);
                                return null;
                            }
                        } catch (Throwable th2) {
                            C9153RRe.A00(th, th2);
                        }
                    } else {
                        th = new FileNotFoundException(002.A0R("File does not exist. Url: ", str3));
                    }
                } else {
                    th = new IllegalArgumentException(002.A0R("Invalid input file Url: ", str3));
                }
            } else {
                th = new IllegalArgumentException(002.A0R("Url MUST be of 'file:' scheme. Found: ", scheme));
            }
            throw th;
            throw th;
        } catch (FileNotFoundException | IllegalArgumentException | SecurityException e9) {
            runtimeException = new RuntimeException("Exception while parsing fileUrl", e9);
            throw runtimeException;
        }
    }

    public final String computeSHA256(byte[] bArr, String str) {
        02V.A03(bArr, "file bytes can not be null");
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(str.getBytes(ReactWebViewManager.HTML_ENCODING), "HmacSHA256"));
            return C56478HzA.A00(instance.doFinal(bArr)).toLowerCase(Locale.US);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("HMAC SHA256 algorithm is not found.", e);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF_8 encoding is not supported.", e2);
        } catch (InvalidKeyException e3) {
            throw new RuntimeException("Invalid secret key.", e3);
        }
    }
}
