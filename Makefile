JM=jmeter
R=results.jtl

ui:
	${JM} -t helloserver-ordered.jmx
execute:
	${JM} -n -t helloserver-ordered.jmx -l ${R}
clean:
	rm ${R} *.log
