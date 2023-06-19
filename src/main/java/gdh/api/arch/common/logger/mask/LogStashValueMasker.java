package gdh.api.arch.common.logger.mask;

import com.fasterxml.jackson.core.JsonStreamContext;
import lombok.extern.slf4j.Slf4j;
//import net.logstash.logback.mask.ValueMasker;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/**
 * 민감정보 마스킹처리를 위한 LogStash Value Masker
 *
 * @author sanghoon.park
 */
@Slf4j
public class LogStashValueMasker{
//public class LogStashValueMasker implements ValueMasker {
//	private String field;
//	private String maskPattern;
//	private Pattern multilinePattern;
//	private final List<String> maskPatterns = new ArrayList<>();
//
//	public String getField() {
//		return field;
//	}
//
//	public void setField(String field) {
//		this.field = field;
//	}
//
//	public String getMaskPattern(){
//		return maskPattern;
//	}
//
//	public void setMaskPattern(String maskPattern){
//		this.maskPattern = maskPattern;
//		String[] patterns = maskPattern.split(",");
//		for(String pattern : patterns){
//			pattern = StringUtils.trimToEmpty(pattern);
//			maskPatterns.add(pattern);
//		}
//		multilinePattern = Pattern.compile(String.join("|", maskPatterns), Pattern.MULTILINE);
//	}
//
//	@Override public Object mask(JsonStreamContext context, Object value) {
//
//		if (value instanceof CharSequence && context.getCurrentName().equals(this.getField())) {
//			return maskMessage((String) value);
//		}
//		return value;
//	}
//
//	private String maskMessage(String message) {
//		if (multilinePattern == null) {
//			return message;
//		}
//		StringBuilder sb = new StringBuilder(message);
//		Matcher matcher = multilinePattern.matcher(sb);
//		while (matcher.find()) {
//			IntStream.rangeClosed(1, matcher.groupCount()).forEach(group -> {
//				if (matcher.group(group) != null) {
//					IntStream.range(matcher.start(group), matcher.end(group)).forEach(i -> sb.setCharAt(i, '*'));
//				}
//			});
//		}
//		return sb.toString();
//	}
}
