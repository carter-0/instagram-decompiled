package com.facebook.smartcapture.docauth;

import X.002;
import X.0qQ;
import X.AnonymousClass7TE;
import X.DbT;
import X.Pxe;
import X.Pxf;
import android.content.Intent;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CreditCardScannerResult {
    public static final Companion Companion = new Object();
    public final String digitOcrResult;
    public final String expiryDate;
    public final boolean isFound;
    public final String issueDate;
    public final String mergedOcrResult;
    public final String name;
    public final String number;
    public final String ocrResult;
    public final long processingTime;
    public final String textOcrResult;

    public final class Companion {
        public final CreditCardScannerResult fromIntent(Intent intent) {
            0qQ.A0B(intent, 0);
            return new CreditCardScannerResult(true, intent.getStringExtra("credit_card_number"), intent.getStringExtra("credit_card_name"), intent.getStringExtra("credit_card_expiry_date"), (String) null, 0, (String) null, (String) null, (String) null, (String) null);
        }

        public final String getDebugReadableFormat(Intent intent) {
            0qQ.A0B(intent, 0);
            return getDebugReadableFormat(intent.getStringExtra("credit_card_number"), intent.getStringExtra("credit_card_name"), intent.getStringExtra("credit_card_expiry_date"), intent.getStringExtra("credit_card_issue_date"));
        }

        /* access modifiers changed from: private */
        public final String insertSpacesAtPositions(String str, int... iArr) {
            int length;
            if (str == null) {
                return str;
            }
            int length2 = str.length();
            if (length2 == 0 || (length = iArr.length) == 0) {
                return str;
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            int i = 0;
            for (int i2 = 0; i2 < length2; i2++) {
                if (i < length && i2 == iArr[i]) {
                    i++;
                    A1A.append(' ');
                }
                A1A.append(str.charAt(i2));
            }
            return A1A.toString();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }

        public final String getDebugReadableFormat(String str, String str2, String str3, String str4) {
            Locale locale = Locale.US;
            if (str2 == null) {
                str2 = "";
            }
            if (str3 == null) {
                str3 = "";
            }
            if (str4 == null) {
                str4 = "";
            }
            return Pxe.A12(locale, "Number: %s\nName: %s\nValid to: %s\nValid from: %s", Arrays.copyOf(new Object[]{str, str2, str3, str4}, 4));
        }
    }

    public static final String getDebugReadableFormat(Intent intent) {
        return Companion.getDebugReadableFormat(intent);
    }

    public static final String getDebugReadableFormat(String str, String str2, String str3, String str4) {
        return Companion.getDebugReadableFormat(str, str2, str3, str4);
    }

    public static final String insertSpacesAtPositions(String str, int... iArr) {
        return Companion.insertSpacesAtPositions(str, iArr);
    }

    public final String getDigitOcrResult() {
        return this.digitOcrResult;
    }

    public final String getExpiryDate() {
        return this.expiryDate;
    }

    public final String getIssueDate() {
        return this.issueDate;
    }

    public final String getMergedOcrResult() {
        return this.mergedOcrResult;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getNumberWithSpaces() {
        Companion companion;
        int[] iArr;
        String str = this.number;
        if (str == null) {
            return str;
        }
        int length = str.length();
        if (Integer.valueOf(length) == null) {
            return str;
        }
        if (length == 15) {
            companion = Companion;
            iArr = new int[]{4, 10};
        } else if (length != 16) {
            return str;
        } else {
            companion = Companion;
            iArr = new int[]{4, 8, 12};
        }
        return companion.insertSpacesAtPositions(str, iArr);
    }

    public final String getOcrResult() {
        return this.ocrResult;
    }

    public final long getProcessingTime() {
        return this.processingTime;
    }

    public final String getTextOcrResult() {
        return this.textOcrResult;
    }

    public final boolean isFound() {
        return this.isFound;
    }

    public String toString() {
        return 002.A0R(Pxe.A12(Locale.US, "Found: %b\nProcessing time: %d", Pxf.A1X(Boolean.valueOf(this.isFound), Long.valueOf(this.processingTime), 2)), Companion.getDebugReadableFormat(this.number, this.name, this.expiryDate, this.issueDate));
    }

    public CreditCardScannerResult(boolean z, String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8) {
        this.isFound = z;
        this.number = str;
        this.name = str2;
        this.expiryDate = str3;
        this.issueDate = str4;
        this.processingTime = j;
        this.ocrResult = str5;
        this.digitOcrResult = str6;
        this.textOcrResult = str7;
        this.mergedOcrResult = str8;
    }

    public final String getDisplayFormat() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(getNumberWithSpaces());
        String str = this.expiryDate;
        if (str != null && str.length() > 0) {
            A1A.append("\n");
            A1A.append(str);
        }
        return DbT.A10(A1A);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CreditCardScannerResult(boolean r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, long r18, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r12 = this;
            r1 = r24
            r10 = r22
            r9 = r21
            r8 = r20
            r6 = r18
            r5 = r17
            r4 = r16
            r3 = r15
            r2 = r14
            r0 = r24 & 2
            r11 = 0
            if (r0 == 0) goto L_0x0016
            r2 = r11
        L_0x0016:
            r0 = r24 & 4
            if (r0 == 0) goto L_0x001b
            r3 = r11
        L_0x001b:
            r0 = r24 & 8
            if (r0 == 0) goto L_0x0020
            r4 = r11
        L_0x0020:
            r0 = r24 & 16
            if (r0 == 0) goto L_0x0025
            r5 = r11
        L_0x0025:
            r0 = r24 & 32
            if (r0 == 0) goto L_0x002b
            r6 = 0
        L_0x002b:
            r0 = r24 & 64
            if (r0 == 0) goto L_0x0030
            r8 = r11
        L_0x0030:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0035
            r9 = r11
        L_0x0035:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x003a
            r10 = r11
        L_0x003a:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x0040
            r11 = r23
        L_0x0040:
            r0 = r12
            r1 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.smartcapture.docauth.CreditCardScannerResult.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
