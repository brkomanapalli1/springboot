FROM alpine

CMD ["echo", "welcome to personal"]

RUN apk update
RUN apk add vim
RUN apk add curl