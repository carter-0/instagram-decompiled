package com.facebook.react.interfaces.exceptionmanager;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.DbS;
import X.G9t;
import java.util.ArrayList;
import java.util.List;

public interface ReactJsExceptionHandler {

    public final class ParsedErrorImpl implements ParsedError {
        public final int exceptionId;
        public final ArrayList frames;
        public final boolean isFatal;
        public final String message;

        public final ArrayList component1() {
            return this.frames;
        }

        public final String component2() {
            return this.message;
        }

        public final int component3() {
            return this.exceptionId;
        }

        public final boolean component4() {
            return this.isFatal;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ParsedErrorImpl) {
                    ParsedErrorImpl parsedErrorImpl = (ParsedErrorImpl) obj;
                    if (!0qQ.A0K(this.frames, parsedErrorImpl.frames) || !0qQ.A0K(this.message, parsedErrorImpl.message) || this.exceptionId != parsedErrorImpl.exceptionId || this.isFatal != parsedErrorImpl.isFatal) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ParsedErrorImpl copy$default(ParsedErrorImpl parsedErrorImpl, ArrayList arrayList, String str, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                arrayList = parsedErrorImpl.frames;
            }
            if ((i2 & 2) != 0) {
                str = parsedErrorImpl.message;
            }
            if ((i2 & 4) != 0) {
                i = parsedErrorImpl.exceptionId;
            }
            if ((i2 & 8) != 0) {
                z = parsedErrorImpl.isFatal;
            }
            AnonymousClass7TG.A1N(arrayList, str);
            return new ParsedErrorImpl(arrayList, str, i, z);
        }

        public int getExceptionId() {
            return this.exceptionId;
        }

        public ArrayList getFrames() {
            return this.frames;
        }

        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int A0K = AnonymousClass7TE.A0K(this.frames);
            return DbS.A06(this.isFatal, (AnonymousClass7TF.A08(this.message, A0K) + this.exceptionId) * 31);
        }

        public boolean isFatal() {
            return this.isFatal;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ParsedErrorImpl(frames=");
            sb.append(this.frames);
            sb.append(", message=");
            sb.append(this.message);
            sb.append(", exceptionId=");
            sb.append(this.exceptionId);
            sb.append(", isFatal=");
            return G9t.A1C(sb, this.isFatal);
        }

        public ParsedErrorImpl(ArrayList arrayList, String str, int i, boolean z) {
            AnonymousClass7TG.A1O(arrayList, str);
            this.frames = arrayList;
            this.message = str;
            this.exceptionId = i;
            this.isFatal = z;
        }

        public final ParsedErrorImpl copy(ArrayList arrayList, String str, int i, boolean z) {
            AnonymousClass7TG.A1N(arrayList, str);
            return new ParsedErrorImpl(arrayList, str, i, z);
        }
    }

    public interface ParsedError {

        public interface StackFrame {
            int getColumnNumber();

            String getFileName();

            int getLineNumber();

            String getMethodName();
        }

        int getExceptionId();

        List getFrames();

        String getMessage();

        boolean isFatal();
    }

    public final class ParsedStackFrameImpl implements ParsedError.StackFrame {
        public final int columnNumber;
        public final String fileName;
        public final int lineNumber;
        public final String methodName;

        public final String component1() {
            return this.fileName;
        }

        public final String component2() {
            return this.methodName;
        }

        public final int component3() {
            return this.lineNumber;
        }

        public final int component4() {
            return this.columnNumber;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ParsedStackFrameImpl) {
                    ParsedStackFrameImpl parsedStackFrameImpl = (ParsedStackFrameImpl) obj;
                    if (!0qQ.A0K(this.fileName, parsedStackFrameImpl.fileName) || !0qQ.A0K(this.methodName, parsedStackFrameImpl.methodName) || this.lineNumber != parsedStackFrameImpl.lineNumber || this.columnNumber != parsedStackFrameImpl.columnNumber) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ParsedStackFrameImpl(fileName=");
            sb.append(this.fileName);
            sb.append(", methodName=");
            sb.append(this.methodName);
            sb.append(", lineNumber=");
            sb.append(this.lineNumber);
            sb.append(", columnNumber=");
            sb.append(this.columnNumber);
            sb.append(')');
            return sb.toString();
        }

        public static /* synthetic */ ParsedStackFrameImpl copy$default(ParsedStackFrameImpl parsedStackFrameImpl, String str, String str2, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = parsedStackFrameImpl.fileName;
            }
            if ((i3 & 2) != 0) {
                str2 = parsedStackFrameImpl.methodName;
            }
            if ((i3 & 4) != 0) {
                i = parsedStackFrameImpl.lineNumber;
            }
            if ((i3 & 8) != 0) {
                i2 = parsedStackFrameImpl.columnNumber;
            }
            AnonymousClass7TG.A1N(str, str2);
            return new ParsedStackFrameImpl(str, str2, i, i2);
        }

        public int getColumnNumber() {
            return this.columnNumber;
        }

        public String getFileName() {
            return this.fileName;
        }

        public int getLineNumber() {
            return this.lineNumber;
        }

        public String getMethodName() {
            return this.methodName;
        }

        public int hashCode() {
            return ((AnonymousClass7TF.A08(this.methodName, AnonymousClass7TE.A0O(this.fileName)) + this.lineNumber) * 31) + this.columnNumber;
        }

        public ParsedStackFrameImpl(String str, String str2, int i, int i2) {
            AnonymousClass7TG.A1O(str, str2);
            this.fileName = str;
            this.methodName = str2;
            this.lineNumber = i;
            this.columnNumber = i2;
        }

        public final ParsedStackFrameImpl copy(String str, String str2, int i, int i2) {
            AnonymousClass7TG.A1N(str, str2);
            return new ParsedStackFrameImpl(str, str2, i, i2);
        }
    }

    void reportJsException(ParsedError parsedError);
}
