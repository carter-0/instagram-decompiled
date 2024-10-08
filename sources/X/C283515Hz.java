package X;

import android.content.res.AssetManager;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: X.5Hz  reason: invalid class name and case insensitive filesystem */
public abstract class C283515Hz {
    public static byte[] A02(AssetManager assetManager, String str) {
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            InputStream open = assetManager.open(str, 3);
            if (open == null) {
                return null;
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int read = open.read(bArr2, 0, 1024);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, read);
                }
                bArr = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } catch (IOException e) {
                try {
                    0KC.A0J("FileParsingUtils", "getFileContentAsByte: failed due to exception: ", e);
                    bArr = null;
                } catch (Throwable th) {
                    open.close();
                    throw th;
                }
            } catch (Throwable th2) {
                C9153RRe.A00(th, th2);
            }
            open.close();
            return bArr;
            throw th;
        } catch (IOException e2) {
            0KC.A0Q("FileParsingUtils", "getFileContentAsByteFromAssets: failed to get file %s, due to exception: ", new Object[]{str, e2});
            return null;
        } catch (Throwable th3) {
            C9153RRe.A00(th, th3);
        }
    }

    public static int[] A03(ReadableByteChannel readableByteChannel, int i) {
        if (i <= 0) {
            0KC.A0Q("FileParsingUtils", "loadParamsArrayFromChannel: received unexpected param size: %d", new Object[]{Integer.valueOf(i)});
            return new int[0];
        }
        int[] iArr = new int[i];
        int i2 = i * 4;
        try {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            if (readableByteChannel.read(allocateDirect) != i2) {
                0KC.A0Q("FileParsingUtils", "populateTranslationTableNewToNew: Failed loading params_map v4 file, didn't read expected param size: %d", new Object[]{Integer.valueOf(i / 2)});
            }
            allocateDirect.flip();
            allocateDirect.asIntBuffer().get(iArr);
            return iArr;
        } catch (IOException e) {
            0KC.A0K("FileParsingUtils", "buildTranslationTable load into array failed", e);
            return iArr;
        }
    }

    public static C283505Hy A00(ReadableByteChannel readableByteChannel) {
        String str;
        String str2;
        Object[] objArr;
        String A0O;
        C283505Hy r2 = new C283505Hy();
        try {
            ByteBuffer allocate = ByteBuffer.allocate(2);
            if (readableByteChannel.read(allocate) == 2) {
                allocate.flip();
                CharBuffer decode = Charset.forName("US-ASCII").decode(allocate);
                if (decode == null) {
                    0KC.A0E("FileParsingUtils", "getHeaderInfoFromParamsMapFile: failed to get first two byte");
                    return r2;
                }
                String obj = decode.toString();
                if (obj != null) {
                    if (obj.equals("v2")) {
                        ByteBuffer allocate2 = ByteBuffer.allocate(128);
                        if (readableByteChannel.read(allocate2) < 0) {
                            0KC.A0E("FileParsingUtils", "getHeaderInfoFromParamsMapFile: failed to get first line");
                            return r2;
                        }
                        allocate2.flip();
                        String[] split = Charset.forName("US-ASCII").decode(allocate2).toString().split("\\r?\\n");
                        int length = split.length;
                        if (length != 0) {
                            String[] split2 = split[0].split(",");
                            int length2 = split2.length;
                            if (length2 >= 2) {
                                r2.A01 = split2[1];
                            }
                            if (length2 >= 3) {
                                Integer.parseInt(split2[2]);
                            }
                            if (length >= 2) {
                                String str3 = split[1];
                                if (str3.length() >= 2) {
                                    String[] split3 = str3.split(",");
                                    String str4 = split3[0];
                                    if (str4.length() < 2) {
                                        str2 = "getHeaderInfoFromParamsMapFile: Second line had unexpected format: %s";
                                        objArr = new Object[]{split[2]};
                                    } else if (str4.charAt(0) == '*') {
                                        Character.isLetter(split3[0].charAt(1));
                                        return r2;
                                    } else {
                                        str2 = "getHeaderInfoFromParamsMapFile: Second line didn't start with a config: %s";
                                        objArr = new Object[]{split[2]};
                                    }
                                }
                            }
                            str2 = "getHeaderInfoFromParamsMapFile: Failed when reading second line - %s";
                            if (length < 2) {
                                A0O = "Only one line read";
                            } else {
                                A0O = 002.A0O("Line too short - ", split[1].length());
                            }
                            objArr = new Object[]{A0O};
                        }
                        return r2;
                    } else if (!obj.equals("v4")) {
                        0KC.A0E("FileParsingUtils", "getSchemaHashFromMclistFile: failed to get header version");
                        return r2;
                    } else {
                        ByteBuffer allocate3 = ByteBuffer.allocate(28);
                        allocate3.order(ByteOrder.LITTLE_ENDIAN);
                        if (readableByteChannel.read(allocate3) != 28) {
                            0KC.A0E("FileParsingUtils", "getSchemaHashFromMclistFile: failed to get header required info");
                            return r2;
                        }
                        allocate3.flip();
                        short s = allocate3.getShort();
                        if (allocate3.getShort() != Short.MAX_VALUE) {
                            0KC.A0E("FileParsingUtils", "getSchemaHashFromMclistFile: magic mismatch");
                            return r2;
                        }
                        allocate3.getShort();
                        r2.A00 = allocate3.getShort() & 65535;
                        allocate3.getShort();
                        allocate3.getShort();
                        allocate3.getShort();
                        allocate3.getShort();
                        allocate3.position(24);
                        allocate3.getShort();
                        allocate3.position(26);
                        short s2 = allocate3.getShort();
                        ByteBuffer allocate4 = ByteBuffer.allocate(s2);
                        int i = s2 + 30;
                        if (s != i) {
                            str2 = "getSchemaHashFromMclistFile: header size doesn't match, in file: %d, read: %d";
                            objArr = new Object[]{Integer.valueOf(s), Integer.valueOf(i)};
                        } else if (readableByteChannel.read(allocate4) != s2) {
                            0KC.A0E("FileParsingUtils", "getSchemaHashFromMclistFile: failed to read hash");
                            return r2;
                        } else {
                            allocate4.flip();
                            r2.A01 = Charset.forName("US-ASCII").decode(allocate4).toString();
                            return r2;
                        }
                    }
                    0KC.A0Q("FileParsingUtils", str2, objArr);
                    return r2;
                }
            }
            0KC.A0E("FileParsingUtils", "getHeaderInfoFromParamsMapFile: failed to get first two chars");
            return r2;
        } catch (IOException e) {
            e = e;
            str = "getHeaderInfoFromParamsMapFile: IOException";
            0KC.A0K("FileParsingUtils", str, e);
            return r2;
        } catch (NumberFormatException e2) {
            e = e2;
            str = "getHeaderInfoFromParamsMapFile: NumberFormatException while getting content from v2";
            0KC.A0K("FileParsingUtils", str, e);
            return r2;
        }
    }

    public static String A01(InputStream inputStream) {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName(StandardCharsets.UTF_8.name())));
            while (true) {
                int read = bufferedReader.read();
                if (read == -1) {
                    break;
                }
                sb.append((char) read);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            0KC.A0M("FileParsingUtils", "getFileContentAsString: failed. File does not exist: %s ", e, new Object[]{inputStream});
        } catch (IOException e2) {
            0KC.A0J("FileParsingUtils", "getFileContentAsString: failed due to exception: ", e2);
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
        }
        return sb.toString();
        throw th;
    }
}
